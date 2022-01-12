public static void writeToDebugTimestamp(java.lang.String str) {
    long currentTime = java.lang.System.currentTimeMillis();
    java.util.Date date = new java.util.Date(currentTime);
    java.lang.String time = ("[" + date) + "] - ";
    com.gmail.bschneppdev.jvassister.guibasic.DebugFile.writeToDebug((time + str));
}