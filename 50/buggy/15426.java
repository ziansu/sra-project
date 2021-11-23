public void setMaxCharactersPerLine(int maxCharactersPerLine) {
    maxCharactersPerLine = maxCharactersPerLine;
    if (com.jp.androidlogger.AndroidLoggerFactory.EXTRA_LOGGING)
        android.util.Log.v(com.jp.androidlogger.AndroidLoggerFactory.TAG, ("setMaxCharactersPerLine: " + maxCharactersPerLine));
    
}