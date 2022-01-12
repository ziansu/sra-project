public void startProcess(java.lang.String workingDir, java.lang.String command) {
    try {
        java.lang.Runtime r = java.lang.Runtime.getRuntime();
        setProcess(r.exec(command, null, new java.io.File(workingDir)));
    } catch (java.io.IOException e) {
        log(NinjaConsole.Style_Error, e.toString());
    }
}