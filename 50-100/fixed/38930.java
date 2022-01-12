private void store(java.lang.String folder) {
    try {
        org.apache.commons.io.FileUtils.writeStringToFile(new java.io.File(("target/page-content-tester/" + folder), ((getTestName()) + ".html")), getPageBody());
    } catch (java.io.IOException e) {
        log.warn("could not store page body for url: {} while executing test: {}", getUrl(), getTestName());
    }
}