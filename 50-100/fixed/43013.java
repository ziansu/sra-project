public void writetHttpGetResult(java.lang.String result, java.lang.String filePath) throws java.io.IOException {
    try (java.io.FileWriter fw = new java.io.FileWriter(filePath)) {
        try (java.io.BufferedWriter bw = new java.io.BufferedWriter(fw)) {
            nerubian.core.Jobs.LOGGER.info("Saving result...");
            bw.write(result);
            nerubian.core.Jobs.LOGGER.debug(result);
        }
    }
}