public com.cisco.oss.foundation.directory.entity.ModelService getModelService(java.lang.String serviceName) {
    com.cisco.oss.foundation.directory.entity.ModelService service = null;
    try {
        service = getDirectoryServiceClient().lookupService(serviceName);
    } catch (com.cisco.oss.foundation.directory.exception.ServiceException se) {
        if ((se.getErrorCode()) == (com.cisco.oss.foundation.directory.exception.ErrorCode.SERVICE_DOES_NOT_EXIST)) {
            com.cisco.oss.foundation.directory.lookup.DirectoryLookupService.LOGGER.error(se.getMessage());
        }else {
            com.cisco.oss.foundation.directory.lookup.DirectoryLookupService.LOGGER.error("Error when getModelService", se);
        }
    }
    return service;
}