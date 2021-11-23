public int myAtoi(java.lang.String str) {
    if (null == str) {
        str = "";
    }
    long ret = atoi(str.trim());
    if (ret > (java.lang.Integer.MAX_VALUE)) {
        ret = java.lang.Integer.MAX_VALUE;
    }else
        if (ret < (java.lang.Integer.MIN_VALUE)) {
            ret = java.lang.Integer.MIN_VALUE;
        }
    
    return ((int) (ret));
}