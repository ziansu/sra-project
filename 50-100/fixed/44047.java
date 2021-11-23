public static void writeFold(java.util.List<java.lang.String> uris, long time) {
    try {
        org.apache.commons.io.FileUtils.writeLines(new java.io.File(((((org.aksw.simba.challenge.BruteForceValidation.OUTPUT_FOLDER) + "results_") + time) + ".txt")), uris);
    } catch (java.io.IOException e) {
        org.aksw.simba.challenge.BruteForceValidation.LOGGER.error("Couldn't write result to file.");
    }
}