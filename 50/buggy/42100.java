@org.junit.Test
public void test001() throws java.lang.Exception {
    java.lang.System.setProperty(DI.ORG_RAPIDPM_DDI_PACKAGESFILE, "junit/org/rapidpm/microservice/microservice.packages");
    org.rapidpm.microservice.Main.deploy();
    org.junit.Assert.assertEquals("Hello Rest World CDI Service", callRestEndpoint());
}