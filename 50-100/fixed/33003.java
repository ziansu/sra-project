@queryModuleTester.BeforeClass
public static void setup() {
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.List<org.apache.log4j.Logger> loggers = java.util.Collections.<org.apache.log4j.Logger>list(org.apache.log4j.LogManager.getCurrentLoggers());
    loggers.add(org.apache.log4j.LogManager.getRootLogger());
    for (org.apache.log4j.Logger logger : loggers) {
        logger.setLevel(org.apache.log4j.Level.OFF);
    }
}