public void setFileName(java.lang.String filename) {
    git = $missing$;
    if (filename.contains(".xml")) {
        fileName = (java.lang.System.getProperty("user.dir")) + filename;
    }else {
        fileName = (java.lang.System.getProperty("user.dir")) + (filename.concat(".xml"));
    }
}