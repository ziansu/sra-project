public void write(java.lang.String s) {
    java.lang.System.out.println(s);
    if ((file) != null) {
        try {
            org.apache.commons.io.FileUtils.writeLines(file, java.util.Arrays.asList(new java.lang.String[]{ s }), true);
        } catch (java.io.IOException e) {
            parser.severe(("Failed to write to file: " + (e.getMessage())));
        }
    }
}