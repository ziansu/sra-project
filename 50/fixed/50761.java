@org.junit.Test
public void matchVersion() throws java.lang.Exception {
    org.junit.Assert.assertEquals(_dbVersionInfo.getSchemaVersion(), service.getVersion());
}