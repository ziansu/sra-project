@java.lang.Override
public com.microsoft.azure.management.ContainerService updateResource(com.microsoft.azure.management.ContainerService resource) throws java.lang.Exception {
    resource = resource.update().withTag("tag2", "value2").withTag("tag3", "value3").withoutTag("tag1").apply();
    org.junit.Assert.assertTrue(resource.tags().containsKey("tag2"));
    org.junit.Assert.assertTrue((!(resource.tags().containsKey("tag1"))));
    return null;
}