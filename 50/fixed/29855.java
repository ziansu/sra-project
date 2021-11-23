@org.junit.BeforeClass
public static void setupSpec() {
    java.lang.System.setProperty(ConfigurationFactory.CONFIGURATION_FILE_PROPERTY, org.openrepose.core.services.context.impl.RequestHeaderServiceContextTest.CONFIG);
    org.openrepose.core.services.context.impl.RequestHeaderServiceContextTest.ctx = ((org.apache.logging.log4j.core.LoggerContext) (org.apache.logging.log4j.LogManager.getContext(false)));
}