public static <T> void logDebug(java.lang.String logMessage, java.lang.Class<T> clasS) {
    if (Main.DEBUG) {
        java.lang.String[] lines = logMessage.split("\\r?\\n");
        java.lang.String toPrint = (pixyel_backend.Log.getClassNameWithDate(clasS)) + "DEBUG:   ";
        for (java.lang.String line : lines) {
            java.lang.System.out.println((toPrint + line));
        }
        try {
            pixyel_backend.userinterface.UIs.DesktopUI.ConsoleWindow.logDebug(logMessage, pixyel_backend.Log.getClassName(clasS));
        } catch (java.lang.Exception e) {
        }
    }
}