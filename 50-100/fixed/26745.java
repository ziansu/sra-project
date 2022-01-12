static void addPrefix(final java.lang.StringBuilder builder, final org.apache.log4j.Logger logger, final java.lang.String method) {
    java.lang.String name = logger.getName();
    if (name == null) {
        name = com.xavax.logger.XLogger.UNKNOWN;
    }
    final int index = name.lastIndexOf('.');
    builder.append((index >= 0 ? name.substring((index + 1)) : name)).append('.').append((method == null ? com.xavax.logger.XLogger.UNKNOWN : method)).append(": ");
}