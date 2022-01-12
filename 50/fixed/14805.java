protected boolean getTimeStampStrict() {
    try {
        return gov.hhs.fha.nhinc.properties.PropertyAccessor.getInstance().getPropertyBoolean(NhincConstants.GATEWAY_PROPERTY_FILE, NhincConstants.TIMESTAMP_STRICT);
    } catch (gov.hhs.fha.nhinc.properties.PropertyAccessException pae) {
        gov.hhs.fha.nhinc.callback.cxf.largefile.TimestampValidator.LOG.error("Failed to determine timestamp strict in gateway.properties, will use default value: {}", pae.getLocalizedMessage(), pae);
    }
    return true;
}