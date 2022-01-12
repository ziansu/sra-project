private static java.lang.String join(java.util.List<java.lang.String> strings, java.lang.String separator) {
    java.lang.StringBuffer buffer = new java.lang.StringBuffer();
    java.util.Iterator<java.lang.String> iterator = strings.iterator();
    while (iterator.hasNext()) {
        buffer.append(iterator.next());
        if (iterator.hasNext()) {
            buffer.append(separator);
        }
    } 
    return buffer.toString();
}