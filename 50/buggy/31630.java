private static void initJdkDependent() {
    if ((org.waarp.common.utility.DetectionUtils.javaVersion()) >= 6) {
        org.waarp.common.file.filesystembased.FilesystemBasedDirImpl.filesystemBasedFtpDirJdk = new org.waarp.common.file.filesystembased.specific.FilesystemBasedDirJdk6();
    }else {
        org.waarp.common.file.filesystembased.FilesystemBasedDirImpl.filesystemBasedFtpDirJdk = new org.waarp.common.file.filesystembased.specific.FilesystemBasedDirJdk5();
    }
    initWindowsSupport();
}