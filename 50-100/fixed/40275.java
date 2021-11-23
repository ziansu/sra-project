private boolean verifyCreatedAfter(java.util.Date date) {
    if (((getCreated()) != null) && (getCreated().after(date))) {
        gov.hhs.fha.nhinc.callback.cxf.largefile.CONNECTTimestamp.LOG.info("Validation of Timestamp: The message was created in the future!");
        return false;
    }else {
        return true;
    }
}