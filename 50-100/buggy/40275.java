private boolean verifyCreatedAfter(java.util.Date date) {
    if (((getCreated()) != null) && (getCreated().after(date))) {
        if (gov.hhs.fha.nhinc.callback.cxf.largefile.CONNECTTimestamp.LOG.isDebugEnabled()) {
            gov.hhs.fha.nhinc.callback.cxf.largefile.CONNECTTimestamp.LOG.debug("Validation of Timestamp: The message was created in the future!");
        }
        return false;
    }else {
        return true;
    }
}