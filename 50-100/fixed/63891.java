@org.junit.Test
public void assertTimeStampIsntUpdated() throws java.lang.Throwable {
    java.io.File resourceFile = com.github.redsolo.vcm.ModelTest.getResourceFile("/Idler.vcm");
    long lastModified = resourceFile.lastModified();
    com.github.redsolo.vcm.Model vcm = new com.github.redsolo.vcm.Model(resourceFile);
    com.github.redsolo.vcm.ComponentData componentData = vcm.getComponentData();
    componentData.setVcid("18a768ae-0f31-4476-852d-6f8c099ad3ab");
    vcm.setComponentData(componentData, false);
    org.junit.Assert.assertThat(resourceFile.lastModified(), org.hamcrest.Matchers.is(lastModified));
}