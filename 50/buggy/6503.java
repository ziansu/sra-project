@org.testng.annotations.BeforeMethod
public void setUp() {
    root = ((ch.qos.logback.classic.Logger) (org.slf4j.LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME)));
    root.getLoggerContext().reset();
    org.testng.AssertJUnit.assertFalse(loci.common.DebugTools.isEnabled());
}