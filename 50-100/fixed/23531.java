@org.junit.Test
public void testBatchDelete() {
    com.google.gcloud.datastore.Key taskKey1 = keyFactory.newKey(1);
    com.google.gcloud.datastore.Key taskKey2 = keyFactory.newKey(2);
    setUpBatchTests(taskKey1, taskKey2);
    datastore.delete(taskKey1, taskKey2);
    org.junit.Assert.assertNull(datastore.get(taskKey1));
    org.junit.Assert.assertNull(datastore.get(taskKey2));
}