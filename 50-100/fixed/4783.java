@org.junit.Test
public void testTransactionalGetOrCreate() {
    com.google.gcloud.datastore.Entity task;
    com.google.gcloud.datastore.Transaction txn = datastore.newTransaction();
    try {
        task = txn.get(taskKey);
        if (task == null) {
            task = com.google.gcloud.datastore.Entity.builder(taskKey).build();
            txn.put(task);
            txn.commit();
        }
    } finally {
        if (txn.active()) {
            txn.rollback();
        }
    }
    org.junit.Assert.assertEquals(task, datastore.get(taskKey));
}