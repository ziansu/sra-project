private void checkOrMkFile() {
    try {
        java.io.File dataFile = new java.io.File(getPathName());
        if ((!(dataFile.exists())) || (!(dataFile.isFile()))) {
            dataFile.createNewFile();
            server.DAO.FileAccess.fileOverWrite(getPathName(), getBasicString());
        }
    } catch (java.io.IOException ioe) {
        ioe.printStackTrace();
    }
}