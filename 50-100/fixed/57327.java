private java.io.PrintWriter getOutputStream(final java.lang.String outputFile) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException {
    if (Constants.STDOUT.equals(outputFile)) {
        java.io.Writer w = new java.io.OutputStreamWriter(java.lang.System.out, "UTF-8");
        return new java.io.PrintWriter(w);
    }else {
        java.io.File file = new java.io.File(outputFile);
        java.io.Writer w = new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), "UTF-8");
        return new java.io.PrintWriter(w);
    }
}