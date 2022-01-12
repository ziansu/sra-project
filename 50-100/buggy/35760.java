@org.junit.Before
public void setUp() {
    java.lang.System.setProperty("javax.xml.parsers.DocumentBuilderFactory", "com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl");
    org.apache.logging.log4j.core.LoggerContext ctx = ((org.apache.logging.log4j.core.LoggerContext) (org.apache.logging.log4j.LogManager.getContext(false)));
    app = ((org.apache.logging.log4j.test.appender.ListAppender) (ctx.getConfiguration().getAppender("List0"))).clear();
    datastore = org.mockito.Mockito.mock(org.openrepose.core.services.datastore.Datastore.class);
}