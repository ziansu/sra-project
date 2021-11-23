@org.junit.Test
public void testNamedKey() {
    com.google.gcloud.datastore.Key taskKey = datastore.newKeyFactory().kind("Task").newKey("sampleTask");
    assertValidKey(taskKey);
}