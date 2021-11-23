public static java.lang.String readFileContent(java.nio.file.Path filePath) throws java.io.IOException {
    if (java.nio.file.Files.isRegularFile(filePath)) {
        try {
            return java.nio.file.Files.readAllLines(filePath).stream().collect(java.util.stream.Collectors.joining(org.publo.controller.utils.FileUtils.LINE_SEP));
        } catch (java.io.IOException ex) {
            org.publo.controller.utils.FileUtils.LOGGER.log(java.util.logging.Level.SEVERE, "Could not read file.", ex);
            throw ex;
        }
    }
    return "";
}