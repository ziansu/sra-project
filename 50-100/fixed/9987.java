public static void logShortError(java.lang.Exception e, int lines) {
    java.lang.String s = e.toString();
    int i = 0;
    for (java.lang.StackTraceElement er : e.getStackTrace()) {
        if (i == lines) {
            break;
        }
        s += "\n\tat " + (er.toString());
        i++;
    }
    e.printStackTrace();
    global.record.Log.log("ERROR", s);
}