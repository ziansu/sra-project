private static java.lang.String join(java.util.List<java.lang.String> list, java.lang.String separator) {
    if (list == null)
        return null;
    
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (java.lang.String element : list)
        sb.append(element).append(separator);
    
    sb.delete(((sb.length()) - (separator.length())), sb.length());
    return sb.toString();
}