private org.apache.airavata.model.appcatalog.computeresource.ResourceJobManagerType getJobMonitorType(java.lang.String addressStr) throws org.apache.airavata.common.exception.AiravataException {
    for (java.util.Map.Entry<java.lang.String, org.apache.airavata.model.appcatalog.computeresource.ResourceJobManagerType> addressEntry : addressMap.entrySet()) {
        if (addressEntry.getKey().matches(addressStr)) {
            return addressEntry.getValue();
        }
    }
    throw new org.apache.airavata.common.exception.AiravataException(("[EJM]: Couldn't identify Resource job manager type from address " + addressStr));
}