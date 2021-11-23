private static void loadTurtle(java.io.File sourceDir, org.openrdf.rio.RDFParser parser) throws java.io.IOException, org.openrdf.rio.RDFHandlerException, org.openrdf.rio.RDFParseException {
    java.io.File[] array = sourceDir.listFiles();
    if (array != null) {
        for (java.io.File file : array) {
            if (file.isDirectory()) {
                io.konig.core.impl.RdfUtil.loadTurtle(file, parser);
            }else
                if (file.getName().endsWith(".ttl")) {
                    java.io.FileInputStream input = new java.io.FileInputStream(file);
                    parser.parse(input, "");
                }
            
        }
    }
}