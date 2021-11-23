private static void createLogger(at.fhv.puzzle2.logging.formatter.LogFormatter formatter, at.fhv.puzzle2.logging.LogLevel minLogLevel) {
    at.fhv.puzzle2.logging.Logger._instance = new at.fhv.puzzle2.logging.Logger(formatter, minLogLevel);
}