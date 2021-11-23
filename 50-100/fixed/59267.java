private boolean marshalPdpFeedFle(edu.cornell.kfs.concur.batch.xmlObjects.PdpFeedFileBaseEntry cdpFeedFileBaseEntry, java.lang.String outputFilePath) {
    boolean success = true;
    try {
        java.io.File pdpFeedFile = getCuMarshalService().marshalObjectToXML(cdpFeedFileBaseEntry, outputFilePath);
        success = true;
    } catch (javax.xml.bind.JAXBException | java.io.IOException e) {
        edu.cornell.kfs.concur.batch.service.impl.ConcurStandardAccountingExtractServiceImpl.LOG.error("There was an error marshalling the PDP feed file.", e);
        success = false;
    }
    return success;
}