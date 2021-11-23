@org.junit.Test
public void testNamedKey() {
    com.google.gcloud.datastore.KeyFactory keyFactory = datastore.newKeyFactory().kind("Task");
    com.google.gcloud.datastore.Key taskKey = keyFactory.newKey("sampleTask");
    assertValidKey(taskKey);
}