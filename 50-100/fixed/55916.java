@java.lang.Override
protected java.lang.Process startFactorio() throws java.io.IOException {
    java.lang.Process process = null;
    java.nio.file.Path application = com.narrowtux.fmm.model.Datastore.getInstance().getFactorioApplication();
    if (com.narrowtux.fmm.util.OS.isMac()) {
        application = application.resolve("Contents/MacOS/factorio");
    }
    process = java.lang.Runtime.getRuntime().exec(new java.lang.String[]{ application.toAbsolutePath().toString() });
    return process;
}