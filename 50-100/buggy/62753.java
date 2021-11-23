private static java.lang.String constructPath(java.lang.String base, int num, java.lang.String ext) {
    java.lang.StringBuffer buffer = new java.lang.StringBuffer();
    if (base != null) {
        buffer.append(base);
    }
    buffer.append("-");
    buffer.append(num);
    if (ext != null) {
        buffer.append(".");
        buffer.append(ext);
    }
    return buffer.toString();
}