private static void reportException(java.lang.Throwable throwable) {
    java.nio.file.Path logPath = java.nio.file.Paths.get(".");
    try {
        java.nio.file.Path gameLogPath = org.terasology.engine.paths.PathManager.getInstance().getLogPath();
        if (gameLogPath != null) {
            logPath = gameLogPath;
        }
    } catch (java.lang.Exception pathManagerConstructorFailure) {
        throwable.addSuppressed(pathManagerConstructorFailure);
    }
    if (org.terasology.engine.Terasology.crashReportEnabled) {
        java.nio.file.Path logFile = logPath.resolve("Terasology.log");
        org.terasology.crashreporter.CrashReporter.report(throwable, logFile);
    }
}