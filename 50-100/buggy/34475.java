private boolean isPictureFile(java.io.File file) {
    java.lang.String fileNameExt = de.webfilesys.util.CommonUtils.getFileExtension(file.getName());
    org.apache.log4j.Logger.getLogger(getClass()).debug(("fileNameExt: " + fileNameExt));
    return (((fileNameExt.equals(".jpg")) || (fileNameExt.equals(".jpeg"))) || (fileNameExt.equals(".png"))) || (fileNameExt.equals(".gif"));
}