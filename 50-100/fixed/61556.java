public java.lang.String getUploadsDirPath() {
    if ((uploadsDirPath) == null) {
        uploadsDirPath = getConfigurationProperties().getProperty(fi.aalto.cs.drumbeat.rest.common.DrumbeatApplication.ConfigParams.UPLOADS_DIR_PATH);
        if ((uploadsDirPath) != null) {
            uploadsDirPath = getRealServerPath(uploadsDirPath);
        }else {
            uploadsDirPath = java.lang.System.getenv(fi.aalto.cs.drumbeat.rest.common.DrumbeatApplication.SystemEnvironment.DRUMBEAT_SHARE_FOLDER);
        }
        if ((uploadsDirPath) == null) {
            throw new java.lang.RuntimeException(("The upload folder is not specified neither in config.properties file, nor as system environment variable " + (fi.aalto.cs.drumbeat.rest.common.DrumbeatApplication.SystemEnvironment.DRUMBEAT_SHARE_FOLDER)));
        }
        uploadsDirPath = uploadsDirPath.trim();
    }
    return uploadsDirPath;
}