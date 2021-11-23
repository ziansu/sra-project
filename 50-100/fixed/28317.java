public void writeContext() {
    de.hbz.lobid.helper.EtikettMaker.logger.info("Writing context file ...");
    try {
        de.hbz.lobid.helper.JsonConverter.getObjectMapper().defaultPrettyPrintingWriter().writeValue(new java.io.File("src/main/resources/context.json"), context);
        de.hbz.lobid.helper.EtikettMaker.logger.info("... done writing context file.");
    } catch (java.lang.Exception e) {
        de.hbz.lobid.helper.EtikettMaker.logger.error("Error during writing context file! ", e);
    }
}