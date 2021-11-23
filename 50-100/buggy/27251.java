private java.lang.String pack(java.util.Collection<?> val) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    boolean first = true;
    for (java.lang.Object singleVal : val) {
        listEscapeToSb(pack(singleVal), sb);
        if (first) {
            first = false;
        }else {
            sb.append(cz.geokuk.framework.MyPreferences.LIST_DELIMITER_CHAR);
        }
    }
    return sb.toString();
}