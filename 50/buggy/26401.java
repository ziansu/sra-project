@org.junit.Test
public void bootFeatures() throws java.lang.Exception {
    assertFeaturesInstalled("eventadmin", "jaas", "ssh", "management", "bundle", "config", "deployer", "diagnostic", "instance", "kar", "log", "package", "service", "system");
}