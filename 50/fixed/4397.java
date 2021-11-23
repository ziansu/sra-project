private void log(com.noveogroup.android.log.Logger.Level level, java.lang.String format, java.lang.Object... arguments) {
    logger.print(level, null, org.slf4j.helpers.MessageFormatter.arrayFormat(format, arguments).getMessage());
}