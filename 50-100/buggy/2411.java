private static void doWork() {
    try {
        if (it.uniud.ailab.dcore.launchers.Launcher.inputPath.isFile()) {
            it.uniud.ailab.dcore.launchers.Launcher.analyzeFile(it.uniud.ailab.dcore.launchers.Launcher.inputPath);
        }else {
            it.uniud.ailab.dcore.launchers.Launcher.analyzeDir();
        }
    } catch (java.io.IOException ioe) {
        java.lang.System.err.println(("Error while analyzing: " + (it.uniud.ailab.dcore.launchers.Launcher.inputPath.getAbsolutePath())));
        java.lang.System.err.println(ioe.getLocalizedMessage());
    }
}