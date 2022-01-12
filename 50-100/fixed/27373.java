public static <T> void logError(java.lang.String logMessage, java.lang.Class<T> clasS) {
    java.lang.String[] lines = logMessage.split("\\r?\\n");
    java.lang.String toPrint = (pixyel_backend.Log.getClassNameWithDate(clasS)) + "ERROR:   ";
    for (java.lang.String line : lines) {
        java.lang.System.err.println((toPrint + line));
    }
    try {
        pixyel_backend.userinterface.UIs.DesktopUI.ConsoleWindow.logError(logMessage, pixyel_backend.Log.getClassName(clasS));
    } catch (java.lang.Exception e) {
    }
}