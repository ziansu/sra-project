private java.lang.String getFileExtension(java.io.File file) {
    java.lang.String fileName = file.getName();
    if (((fileName.lastIndexOf(".")) != (-1)) && ((fileName.lastIndexOf(".")) != 0))
        return fileName.substring(((fileName.lastIndexOf(".")) + 1));
    else
        return null;
    
}