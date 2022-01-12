private void logThread(java.lang.String tag, @com.ysj.log.LogLevel.Level
int logLevel) {
    if (settings.isShowThreadInfo()) {
        logChunk(tag, logLevel, (((com.ysj.log.Printer.HORIZONTAL_DOUBLE_LINE) + " Thread: ") + (java.lang.Thread.currentThread().getName())));
        logDivider(tag, logLevel);
    }
}