static java.lang.String concatenate(java.util.Collection<java.lang.String> list, java.lang.String seperator) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    for (java.lang.String str : list)
        builder.append(str).append(seperator);
    
    if ((list.size()) > 0)
        builder.setLength(((builder.length()) - 1));
    
    return builder.toString();
}