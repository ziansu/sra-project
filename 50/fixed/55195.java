public static LogManager.Logger getLogger() {
    return (LogManager.logger) != null ? LogManager.logger : LogManager.initLogger();
}