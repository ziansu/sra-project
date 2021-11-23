public java.lang.String getDetectFileName(final java.lang.String fileUrl) {
    if (org.apache.commons.lang3.StringUtils.isBlank(fileUrl)) {
        return com.blackducksoftware.integration.detect.jenkins.tools.DetectDownloadManager.DEFAULT_DETECT_JAR;
    }
    return fileUrl.substring(((fileUrl.lastIndexOf("/")) + 1));
}