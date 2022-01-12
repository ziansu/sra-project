private java.lang.String changeLevelToString(int logLevel) {
    java.lang.String level = "Undefined";
    switch (logLevel) {
        case android.util.Log.DEBUG :
            level = "DEBUG";
            break;
        case android.util.Log.INFO :
            level = "INFO";
            break;
        case android.util.Log.WARN :
            level = "WARN";
            break;
        case android.util.Log.ERROR :
            level = "ERROR";
            break;
        case android.util.Log.VERBOSE :
            level = "VERBOSE";
            break;
        case android.util.Log.ASSERT :
            level = "ASSERT";
            break;
    }
    return level;
}