public void createNewEmptyDbFile(java.lang.String DBfilename) {
    try {
        java.io.File file = new java.io.File(DBfilename);
        file.delete();
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Cannot create a new database file.", e);
    }
}