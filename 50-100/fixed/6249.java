public static void printToFile(java.lang.String message) {
    try (java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.FileOutputStream(com.uom.cse.distsearch.util.Utility.FILE_NAME, true))) {
        writer.println(message);
    } catch (java.io.FileNotFoundException e) {
        com.uom.cse.distsearch.util.Utility.LOGGER.error(e.getMessage(), e);
    }
}