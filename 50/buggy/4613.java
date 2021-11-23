private com.jaguarlandrover.rvi.Service getRemoteService(java.lang.String serviceIdentifier) {
    com.jaguarlandrover.rvi.Service service;
    if (null != (service = mAuthorizedRemoteServices.get(serviceIdentifier)))
        return service;
    
    return new com.jaguarlandrover.rvi.Service(null, null, null, serviceIdentifier);
}