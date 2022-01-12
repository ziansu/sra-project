private void logContent(java.lang.String tag, com.ysj.log.LogLevel logLevel, java.lang.String content) {
    java.lang.String[] lines = content.split(java.lang.System.getProperty("line.separator"));
    for (java.lang.String line : lines) {
        if (settings.isShowDivider()) {
            logChunk(tag, logLevel, (((com.ysj.log.Printer.HORIZONTAL_DOUBLE_LINE) + " ") + line));
        }else {
            logChunk(tag, logLevel, line);
        }
    }
}