@org.junit.Test
public void testKeyWithParent() {
    com.google.gcloud.datastore.KeyFactory keyFactory = datastore.newKeyFactory().ancestors(com.google.gcloud.datastore.PathElement.of("TaskList", "default")).kind("Task");
    com.google.gcloud.datastore.Key taskKey = keyFactory.newKey("sampleTask");
    assertValidKey(taskKey);
}