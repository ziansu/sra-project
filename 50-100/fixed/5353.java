public java.lang.String toString() {
    double bodyLength = ((messageBody) != null ? ((double) (messageBody.length)) : 0.0) / ((double) (1024));
    return java.lang.String.format("%s%sBody Dimension: %sKB\n", startLine.toString(), headers.toString(), java.lang.String.valueOf(bodyLength));
}