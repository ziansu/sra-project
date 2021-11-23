public boolean prepare() throws java.lang.Exception {
    if ((!(reportDir.exists())) && (!(reportDir.mkdirs()))) {
        throw new java.io.IOException(("Could not create directory " + (reportDir)));
    }
    for (java.io.File file : reportDir.listFiles()) {
        file.delete();
    }
    return true;
}