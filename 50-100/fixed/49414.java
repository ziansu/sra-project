public boolean prepare() throws java.lang.Exception {
    if ((!(reportDir.exists())) && (!(reportDir.mkdirs()))) {
        throw new java.io.IOException(("Could not create directory " + (reportDir)));
    }
    return true;
}