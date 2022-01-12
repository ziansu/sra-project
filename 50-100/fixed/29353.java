public java.lang.String getKeyValuePairs(java.lang.String[] indices) {
    java.lang.StringBuffer sb = new java.lang.StringBuffer();
    int i = 0;
    for (java.lang.String key : indices) {
        if (i != 0)
            sb.append("|");
        
        sb.append(getKeyValuePair(key));
        i = 1;
    }
    return sb.toString();
}