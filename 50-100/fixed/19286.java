public java.lang.Boolean isSharedStorage(java.lang.String driveletter) throws com.iwave.ext.windows.winrm.WinRMException {
    for (com.iwave.ext.windows.model.wmi.DiskDrive drive : getTargetSystem().listDiskDrives()) {
        com.iwave.ext.windows.model.Disk disk = getTargetSystem().detailDisk(drive.getNumber());
        if (disk != null) {
            for (com.iwave.ext.windows.model.Volume volume : disk.getVolumes()) {
                if (com.emc.sa.service.windows.tasks.VerifyMountPointHostDriveIsNotShared.isVolumeMountedAtDriveLetter(driveletter, volume)) {
                    return disk.getClusteredDisk();
                }
            }
        }
    }
    return null;
}