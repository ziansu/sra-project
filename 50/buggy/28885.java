public static void writeToDefaultFile(tailminuseff.config.Configuration c) throws java.io.FileNotFoundException, java.io.IOException {
    try (java.io.FileOutputStream fos = new java.io.FileOutputStream(new java.io.File(java.lang.System.getProperty("user.home"), tailminuseff.config.ConfigurationIO.DEFAULT_FILE))) {
        tailminuseff.config.ConfigurationIO.write(fos, c);
    }
}