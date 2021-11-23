public java.lang.String toString() {
    double bodyLength = (messageBody.length) / 1024;
    return java.lang.String.format("%s%sBody Dimension: %sKB\n", startLine.toString(), headers.toString(), ((messageBody) != null ? java.lang.String.valueOf(bodyLength) : java.lang.String.valueOf(0)));
}