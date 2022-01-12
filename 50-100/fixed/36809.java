private void sendZippedFilesToRoute(java.lang.String toRoute, java.lang.String fileName, com.borovyksv.util.PDFConverter converter, org.apache.camel.Exchange exchange) throws java.io.IOException {
    java.lang.String zipFileName = fileName.replace(".pdf", ".zip");
    net.lingala.zip4j.core.ZipFile convertedFile = zip(converter.getResultFolder(), zipFileName);
    org.apache.camel.ProducerTemplate template = exchange.getContext().createProducerTemplate();
    template.sendBodyAndHeader(toRoute, org.apache.commons.io.FileUtils.openInputStream(convertedFile.getFile()), "CamelFileName", zipFileName);
    com.borovyksv.camel.processor.PDFProcessor.LOGGER.log(java.util.logging.Level.INFO, java.lang.String.format("%s sended to %s", zipFileName, toRoute));
}