private java.lang.String cleanLine(java.lang.String lineIn) {
    java.lang.String lineOut;
    lineOut = lineIn.replaceAll("'", "");
    lineOut = lineOut.replaceAll("\t", "");
    lineOut = lineOut.replaceAll(";", "");
    lineOut = lineOut.trim();
    return lineOut;
}