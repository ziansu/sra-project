public static LogManager.Logger getLogger() {
    return java.util.Optional.of(LogManager.logger).orElse(LogManager.initLogger());
}