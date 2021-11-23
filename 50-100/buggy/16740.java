public com.emc.storageos.model.dr.SiteErrorResponse toResponse() {
    com.emc.storageos.model.dr.SiteErrorResponse response = new com.emc.storageos.model.dr.SiteErrorResponse();
    response.setCreationTime(this.creationTime);
    response.setServiceCode(serviceCode.ordinal());
    response.setServiceCodeName(serviceCode.name());
    response.setErrorMessage(this.errorMessage);
    response.setOperation(this.operation);
    return response;
}