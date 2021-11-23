public void setExternalAddress(java.lang.String externalAddress) {
    if ((externalAddress == null) || (externalAddress.isEmpty())) {
        throw new java.lang.IllegalArgumentException("ExternalAddress cannot be empty.");
    }
    this.externalAddress = externalAddress;
}