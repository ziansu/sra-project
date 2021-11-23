private static void addPrefix(final java.lang.StringBuilder builder, final org.apache.log4j.Logger logger, final java.lang.String method) {
    final java.lang.String name = logger.getName();
    final int index = name.lastIndexOf('.');
    builder.append((index >= 0 ? name.substring((index + 1)) : name)).append('.').append((method == null ? com.xavax.logger.XLogger.UNKNOWN : method)).append(": ");
}