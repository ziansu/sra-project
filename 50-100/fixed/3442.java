protected int sendContentLengthHeaderIfNotAlreadyPresent(java.io.PrintWriter pw, java.util.Map<java.lang.String, java.lang.String> header, int size) {
    for (java.lang.String headerName : header.keySet()) {
        if (headerName.equalsIgnoreCase("content-length")) {
            try {
                return java.lang.Integer.parseInt(header.get(headerName));
            } catch (java.lang.NumberFormatException ex) {
                return size;
            }
        }
    }
    pw.print((("Content-Length: " + size) + "\r\n"));
    return size;
}