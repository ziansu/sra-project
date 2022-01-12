public java.lang.String getServiceStatus(java.lang.String service) throws org.sleuthkit.autopsy.core.ServicesMonitor.UnknownServiceException {
    if (service == null) {
        throw new org.sleuthkit.autopsy.core.ServicesMonitor.UnknownServiceException(org.openide.util.NbBundle.getMessage(org.sleuthkit.autopsy.core.ServicesMonitor.class, "ServicesMonitor.nullServiceName.excepton.txt"));
    }
    java.lang.String status = statusByService.get(service);
    if (status == null) {
        throw new org.sleuthkit.autopsy.core.ServicesMonitor.UnknownServiceException(org.openide.util.NbBundle.getMessage(org.sleuthkit.autopsy.core.ServicesMonitor.class, "ServicesMonitor.unknownServiceName.excepton.txt"));
    }
    return status;
}