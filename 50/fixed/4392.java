@org.junit.Test
public void testKeyWithParent() {
    com.google.gcloud.datastore.Key taskKey = datastore.newKeyFactory().ancestors(com.google.gcloud.datastore.PathElement.of("TaskList", "default")).kind("Task").newKey("sampleTask");
    assertValidKey(taskKey);
}