private java.lang.Runnable createJobFileScan(final stroom.util.zip.StroomZipRepository stroomZipRepository, final java.io.File file) {
    return () -> {
        if (!(monitor.isTerminated())) {
            fileScan(stroomZipRepository, file);
        }else {
            LOGGER.info("run() - Quit File Scan %s", file);
        }
    };
}