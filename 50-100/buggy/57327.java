private java.io.PrintWriter getOutputStream(final java.lang.String outputFile) throws java.io.FileNotFoundException {
    if (Constants.STDOUT.equals(outputFile)) {
        return new java.io.PrintWriter(java.lang.System.out);
    }else {
        final java.io.File file = new java.io.File(outputFile);
        java.io.Writer w = null;
        try {
            w = new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), "UTF-8");
        } catch (java.io.UnsupportedEncodingException e) {
            java.lang.System.err.println("UTF-8 is not supported - exiting");
            java.lang.System.exit(1);
        }
        return new java.io.PrintWriter(w);
    }
}