public static java.lang.String toString(long[] array, java.lang.String separator) {
    final java.lang.StringBuilder buf = new java.lang.StringBuilder();
    boolean first = true;
    for (java.lang.Object anArray : array) {
        if (first)
            first = false;
        else
            buf.append(separator);
        
        buf.append(anArray);
    }
    return buf.toString();
}