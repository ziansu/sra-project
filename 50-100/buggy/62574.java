@java.lang.Override
public void addToFSTab(java.net.URI hostId, java.lang.String mountPath, java.net.URI resId, java.lang.String subDirectory, java.lang.String security, java.lang.String fsType) {
    mountUtils = new com.emc.storageos.computesystemcontroller.hostmountadapters.LinuxMountUtils(dbClient.queryObject(com.emc.storageos.db.client.model.Host.class, hostId));
    com.emc.storageos.db.client.model.FileShare fs = dbClient.queryObject(com.emc.storageos.db.client.model.FileShare.class, resId);
    com.emc.storageos.model.file.ExportRule export = com.emc.storageos.db.client.util.FileOperationUtils.findExport(fs, subDirectory, security, dbClient);
    java.lang.String options = "nolock,sec=";
    mountUtils.addToFSTab(mountPath, export.getMountPoint(), fsType, (options + security));
}