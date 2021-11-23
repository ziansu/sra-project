public void start() {
    try {
        proc = java.lang.Runtime.getRuntime().exec(new java.lang.String[]{ "logcat" , "CLOG:V" , " -d" , " -v" , " raw" , " celix:V" , " *:S" });
        java.io.OutputStream os = proc.getOutputStream();
        this.inStd = proc.getInputStream();
        startReaders();
        os.flush();
    } catch (java.lang.Exception e1) {
    }
}