public java.io.FileInputStream getFileAsStream() throws kr.projectn.fshare.mysql.exception.ExceptionMonitor {
    java.io.FileInputStream fis;
    try {
        fis = new java.io.FileInputStream(fileData);
        fis.close();
    } catch (java.io.IOException e) {
        fis = null;
        return null;
    }
    return fis;
}