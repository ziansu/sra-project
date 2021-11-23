private void log(com.noveogroup.android.log.Logger.Level level, java.lang.String format, java.lang.Object arg) {
    logger.print(level, null, org.slf4j.helpers.MessageFormatter.format(format, arg).getMessage());
}