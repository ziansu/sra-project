private boolean hasDiff(java.io.File expected, java.io.File actual) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String[] cmd = getCmdLine();
    java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
    java.lang.Process process = runtime.exec(cmd);
    int exitCode = process.waitFor();
    if (exitCode == 0) {
        return false;
    }
    return true;
}