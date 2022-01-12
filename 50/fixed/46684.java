@org.simpleframework.xml.core.Validate
public void checkIfEndpointOrLocationIsSet() throws org.syncany.plugins.transfer.StorageException {
    if (((location) == null) && ((endpoint) == null)) {
        throw new org.syncany.plugins.transfer.StorageException("Either location or endpoint have to be set");
    }
}