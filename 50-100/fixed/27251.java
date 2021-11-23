private java.lang.String pack(java.util.Collection<?> val) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (java.lang.Object singleVal : val) {
        listEscapeToSb(pack(singleVal), sb).append(cz.geokuk.framework.MyPreferences.LIST_DELIMITER_CHAR);
    }
    return sb.toString();
}