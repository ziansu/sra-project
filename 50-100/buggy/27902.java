public java.lang.String getAbsolutePath(java.lang.String strFolder) {
    java.lang.String strPath;
    if (strFolder == "..") {
        int pos = path.lastIndexOf("/");
        strPath = path.substring(0, pos);
    }else
        strPath = ((path) + "/") + strFolder;
    
    return strPath;
}