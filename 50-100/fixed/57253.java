public void error(com.emc.storageos.svcs.errorhandling.model.ServiceCoded sc) {
    if (sc != null) {
        setServiceCode(sc.getServiceCode().getCode());
        setMessage(sc.getMessage());
    }
    updateStatus(com.emc.storageos.db.client.model.Operation.Status.error.name());
    if (sc instanceof java.lang.Exception) {
        com.emc.storageos.db.client.model.Operation._log.info("Setting operation to error due to an exception {}", com.emc.storageos.db.client.util.ExceptionUtils.getExceptionMessage(((java.lang.Exception) (sc))));
        com.emc.storageos.db.client.model.Operation._log.info("Caused by: {} ", ((java.lang.Exception) (sc)));
    }
}