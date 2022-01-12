public int myAtoi(java.lang.String str) {
    if (null == str) {
        str = "";
    }
    long ret = atoi(str);
    if (ret > (java.lang.Integer.MAX_VALUE)) {
        ret = java.lang.Integer.MAX_VALUE;
    }else
        if (ret < (java.lang.Integer.MIN_VALUE)) {
            ret = java.lang.Integer.MIN_VALUE;
        }else {
            ret = ((int) (ret));
        }
    
    return ((int) (ret));
}