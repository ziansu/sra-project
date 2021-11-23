private void deleteDirectory(final java.io.File directory) throws java.io.IOException {
    if (directory.exists()) {
        for (final java.io.File file : directory.listFiles()) {
            if (file.isDirectory()) {
                deleteDirectory(file);
            }
            org.junit.Assert.assertTrue(("Could not delete " + (file.getAbsolutePath())), file.delete());
        }
    }
}