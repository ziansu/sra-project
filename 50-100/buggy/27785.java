@org.junit.Test
public void Bug1() {
    org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger();
    com.geewhiz.pacify.utils.LoggingUtils.setLogLevel(logger, Level.INFO);
    java.io.File testResourceFolder = new java.io.File("src/test/resources/Bugfixing/Bug1");
    java.io.File targetResourceFolder = new java.io.File("target/test-resources/Bugfixing/Bug1");
    java.util.LinkedHashSet<com.geewhiz.pacify.defect.Defect> defects = createPrepareAndExecuteValidator(testResourceFolder, targetResourceFolder);
    org.junit.Assert.assertEquals("We shouldnt get any defects.", 0, defects.size());
}