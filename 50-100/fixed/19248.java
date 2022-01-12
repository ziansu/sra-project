private void ensureOutputExists(java.io.File outputFile) {
    if (!(outputFile.exists())) {
        if (!(outputFile.mkdirs())) {
            log(("Can't create " + (outputFile.getPath())), Project.MSG_ERR);
        }
    }
}