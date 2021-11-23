public static void deleteDirectory(java.lang.String dirName) {
    try {
        org.apache.commons.io.FileUtils.deleteDirectory(new java.io.File(dirName));
    } catch (java.io.IOException e) {
        com.wikia.webdriver.common.logging.PageObjectLogging.log("deleteDirectory", e, false);
    }
}