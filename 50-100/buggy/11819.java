private void createFileDirectory(java.io.File files) {
    try {
        if (!(files.exists())) {
            if (files.mkdirs()) {
                com.psk.pms.service.FileServiceImpl.LOGGER.info("Multiple directories are created!");
            }else {
                com.psk.pms.service.FileServiceImpl.LOGGER.info("Failed to create multiple directories!");
            }
        }
    } catch (java.lang.Throwable e) {
        com.psk.pms.service.FileServiceImpl.LOGGER.info("Something went wrong!!");
    }
}