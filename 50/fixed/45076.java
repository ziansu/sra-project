public void getFile(@org.hibernate.validator.constraints.NotBlank(message = "Source file path cannot be empty.")
final java.lang.String srcRemotePath, @org.hibernate.validator.constraints.NotBlank(message = "Destination local path cannot be empty")
final java.lang.String dstLocalPath) throws com.netflix.genie.common.exceptions.GenieException {
    log.debug("Called with src path {} and destination path {}", srcRemotePath, dstLocalPath);
    this.getFileTransfer(srcRemotePath).getFile(srcRemotePath, dstLocalPath);
}