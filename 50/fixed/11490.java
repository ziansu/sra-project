private void logHeaderContent(java.lang.String tag, @com.ysj.log.LogLevel.Level
int logLevel, int methodCount) {
    logThread(tag, logLevel);
    logMethod(tag, logLevel, methodCount);
}