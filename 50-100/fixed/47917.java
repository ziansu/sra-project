public static void result(java.lang.String command, java.io.File image, boolean success) {
    byte[] bytes = new byte[0];
    try {
        bytes = new org.apache.commons.codec.binary.Base64().encode(org.apache.commons.io.FileUtils.readFileToByteArray(image));
    } catch (java.io.IOException e) {
        com.wikia.webdriver.common.logging.LOG.error("logImage", e);
    }
    com.wikia.webdriver.common.logging.LOG.allowLongDesc = true;
    com.wikia.webdriver.common.logging.LOG.appendToReport(command, (("<img src=\"data:image/png;base64," + (new java.lang.String(bytes, java.nio.charset.StandardCharsets.UTF_8))) + "\">"), success, false);
}