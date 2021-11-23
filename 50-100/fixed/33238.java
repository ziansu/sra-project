@java.lang.Override
public void run() {
    for (java.nio.file.Path path : com.vinumeris.crashfx.CrashFX.listDir(com.vinumeris.crashfx.CrashFX.DIRECTORY)) {
        if ((!(path.toString().endsWith(".crash.txt"))) || (!(com.vinumeris.crashfx.CrashFX.attemptReportUpload(path))))
            continue;
        
        com.vinumeris.crashfx.CrashFX.uncheck(() -> java.nio.file.Files.delete(path));
    }
}