private java.lang.String getDefaultLogFileLocation() {
    java.lang.String tmpPath = java.lang.System.getProperty("java.io.tmpdir");
    return tmpPath + "mmexec";
}