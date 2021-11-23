@javax.annotation.PostConstruct
private void init() {
    try {
        device = findDevice();
    } catch (org.dcm4che3.conf.core.api.ConfigurationException e) {
        throw new java.lang.RuntimeException(e);
    }
    findOrCreateRejectionCodes(device);
    initImageReaderFactory(device);
    initImageWriterFactory(device);
}