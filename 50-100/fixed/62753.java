private static java.lang.String constructPath(java.lang.String base, int num, java.lang.String ext) {
    final java.lang.StringBuilder buffer = new java.lang.StringBuilder();
    if (base != null) {
        buffer.append(base);
    }
    if (num > 0) {
        buffer.append("-").append(num);
    }
    if (ext != null) {
        buffer.append(".").append(ext);
    }
    return buffer.toString();
}