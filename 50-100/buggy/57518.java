com.aegisql.conveyor.persistence.core.Persistence<java.lang.Integer> getPersitence(java.lang.String table) {
    try {
        return com.aegisql.conveyor.persistence.jdbc.impl.derby.DerbyPersistence.forKeyClass(java.lang.Integer.class).schema("perfConv").partTable(table).completedLogTable((table + "Completed")).labelConverter(com.aegisql.conveyor.persistence.core.harness.TrioPart.class).whenArchiveRecords().markArchived().maxBatchTime(1000, java.util.concurrent.TimeUnit.MILLISECONDS).maxBatchSize(100).build();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        throw new java.lang.RuntimeException(e);
    }
}