public static void assertTablesExist(com.cloudant.sync.sqlite.SQLDatabaseQueue dbQueue, final java.lang.String... tables) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    dbQueue.submit(new com.cloudant.sync.sqlite.SQLQueueCallable<java.lang.Void>() {
        @java.lang.Override
        public java.lang.Void call(com.cloudant.sync.sqlite.SQLDatabase db) throws java.lang.Exception {
            java.util.Set<java.lang.String> allTables = com.cloudant.sync.util.SQLDatabaseTestUtils.getAllTableNames(db);
            for (java.lang.String table : tables) {
                org.junit.Assert.assertThat(allTables, org.hamcrest.CoreMatchers.hasItem(table));
            }
            return null;
        }
    }).get();
}