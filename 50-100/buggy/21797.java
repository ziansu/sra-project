@java.lang.Override
protected java.lang.String getFileMirrorStatusForSuccess(com.emc.storageos.db.client.model.FileShare fs) {
    if (fs.getStorageDevice().equals(getStorageUri())) {
        com.emc.storageos.volumecontroller.impl.file.MirrorFileResyncTaskCompleter._log.info("resync op is success - fs name {} and mirror state {}", fs.getName(), fs.getMirrorStatus());
        return MirrorStatus.UNKNOWN.name();
    }else {
        com.emc.storageos.volumecontroller.impl.file.MirrorFileResyncTaskCompleter._log.info("resync op is success - fs name {} and mirror state {}", MirrorStatus.SYNCHRONIZED.name());
        return MirrorStatus.SYNCHRONIZED.name();
    }
}