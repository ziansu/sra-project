@java.lang.Override
public java.util.Map<java.lang.String, java.lang.String> getJobMessageProperties() {
    if ((jobProperties) == null) {
        jobProperties = super.getJobMessageProperties();
        jobProperties.put(VdcObjectType.VM.name().toLowerCase(), ((org.ovirt.engine.core.bll.exportimport.RemoveVmFromImportExportCommand.getVmName()) == null ? "" : org.ovirt.engine.core.bll.exportimport.RemoveVmFromImportExportCommand.getVmName()));
        jobProperties.put(VdcObjectType.Storage.name().toLowerCase(), org.ovirt.engine.core.bll.exportimport.RemoveVmFromImportExportCommand.getStorageDomainName());
    }
    return jobProperties;
}