@java.lang.Override
public net.decasdev.dokan.DokanVolumeInformation onGetVolumeInformation(java.lang.String arg0, net.decasdev.dokan.DokanFileInfo arg1) throws net.decasdev.dokan.DokanOperationException {
    log.info("[onGetVolumeInformation]");
    try {
        net.decasdev.dokan.DokanVolumeInformation info = new net.decasdev.dokan.DokanVolumeInformation();
        info.fileSystemFlags = org.opendedup.sdfs.windows.fs.WinSDFS.SUPPORTED_FLAGS;
        info.maximumComponentLength = 256;
        info.volumeName = "Dedup Filesystem";
        info.fileSystemName = "SDFS";
        info.volumeSerialNumber = Main.volume.getSerialNumber();
        return info;
    } catch (java.lang.Exception e) {
        log.error("error getting volume info", e);
        throw new net.decasdev.dokan.DokanOperationException(net.decasdev.dokan.WinError.ERROR_GEN_FAILURE);
    }
}