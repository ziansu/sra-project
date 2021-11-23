private static com.github.albanseurat.springboot.plugin.executors.InputStreamHandler.LogLevelAgnosticLogger infoLoggerFor(final org.slf4j.Logger logger) {
    return new com.github.albanseurat.springboot.plugin.executors.InputStreamHandler.LogLevelAgnosticLogger() {
        @java.lang.Override
        public void log(java.lang.String value) {
            logger.info(value);
        }
    };
}