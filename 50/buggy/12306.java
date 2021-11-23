public void putFile(@org.hibernate.validator.constraints.NotBlank(message = "Source local path cannot be empty.")
final java.lang.String srcLocalPath, @org.hibernate.validator.constraints.NotBlank(message = "Destination remote path cannot be empty")
final java.lang.String dstRemotePath) throws com.netflix.genie.common.exceptions.GenieException {
    log.debug("Called with src path {} and destination path {}", srcLocalPath, dstRemotePath);
    getFileTransfer(dstRemotePath).putFile(srcLocalPath, dstRemotePath);
}