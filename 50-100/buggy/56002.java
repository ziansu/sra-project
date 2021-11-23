protected long sendContentLengthHeaderIfNotAlreadyPresent(java.io.PrintWriter pw, long defaultSize) {
    java.lang.String contentLengthString = getHeader("content-length");
    long size = defaultSize;
    if (contentLengthString != null) {
        try {
            size = java.lang.Long.parseLong(contentLengthString);
        } catch (java.lang.NumberFormatException ex) {
            NanoHTTPD.LOG.severe(("content-length was no number " + contentLengthString));
        }
    }
    pw.print((("Content-Length: " + size) + "\r\n"));
    return size;
}