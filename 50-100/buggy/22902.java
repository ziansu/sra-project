private void logToDebugLog(java.lang.String message) {
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("HH:mm:ss.SSS");
    java.util.Date now = new java.util.Date();
    debugLog.append(sdf.format(now)).append("   ").append(message).append(java.lang.System.lineSeparator());
    logToDebugLog((((sdf.format(now)) + "   ") + message));
}