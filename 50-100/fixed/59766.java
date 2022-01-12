static java.lang.String catColumnNames(java.lang.String[] columnNames, char delim) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (java.lang.String s : columnNames) {
        if ((sb.length()) > 0)
            sb.append(delim);
        
        sb.append(com.breeze.hib.MetadataBuilder.unBracket(s));
    }
    return sb.toString();
}