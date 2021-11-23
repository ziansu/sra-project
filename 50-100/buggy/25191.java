public static void init() {
    if (jaws.business.init.LoggingInitializer.initialized) {
        throw new java.lang.IllegalStateException("LoggingInitializer already initialized");
    }else {
        jaws.business.init.LoggingInitializer.initialized = true;
    }
    jal.business.log.JALogger logger = new jal.business.log.JALogger();
    logger.addListener(new jal.business.loggers.StreamLogger(java.lang.System.out));
    logger.addListener(new jal.business.loggers.FileLogger("../logs/jaws.log"));
    jaws.context.Context.logger = logger;
    Context.logger.info("LoggingInitializer initialized.");
}