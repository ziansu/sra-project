private boolean isPictureFile(java.io.File file) {
    java.lang.String fileNameExt = de.webfilesys.util.CommonUtils.getFileExtension(file.getName());
    return (((fileNameExt.equals(".jpg")) || (fileNameExt.equals(".jpeg"))) || (fileNameExt.equals(".png"))) || (fileNameExt.equals(".gif"));
}