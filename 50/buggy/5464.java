protected long getTimeStampFutureTTL() {
    try {
        return gov.hhs.fha.nhinc.properties.PropertyAccessor.getInstance().getPropertyLong(NhincConstants.GATEWAY_PROPERTY_FILE, NhincConstants.TIMESTAMP_FUTURE_TIME_TO_LIVE);
    } catch (gov.hhs.fha.nhinc.properties.PropertyAccessException pae) {
        gov.hhs.fha.nhinc.callback.cxf.largefile.TimestampValidator.LOG.warn("Failed to determine timestamp future TTL in gateway.properties, will use default value: {}", pae.getLocalizedMessage());
    }
    return gov.hhs.fha.nhinc.callback.cxf.largefile.TimestampValidator.INVALID_LONG_VALUE;
}