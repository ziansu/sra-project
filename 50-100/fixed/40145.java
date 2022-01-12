public static <T> void logInfo(java.lang.String logMessage, java.lang.Class<T> clasS) {
    java.lang.String[] lines = logMessage.split("\\r?\\n");
    java.lang.String toPrint = (pixyel_backend.Log.getClassNameWithDate(clasS)) + "INFO:    ";
    for (java.lang.String line : lines) {
        java.lang.System.out.println((toPrint + line));
    }
    try {
        pixyel_backend.userinterface.UIs.DesktopUI.ConsoleWindow.logInfo(logMessage, pixyel_backend.Log.getClassName(clasS));
    } catch (java.lang.Exception e) {
    }
}