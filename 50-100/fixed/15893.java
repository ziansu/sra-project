@org.springframework.scheduling.annotation.Scheduled(fixedRate = com.imcode.tools.jdbmtosql.utils.Constants.SCHEDULING_FIXED_RATE, initialDelay = com.imcode.tools.jdbmtosql.utils.Constants.SCHEDULING_INITIAL_DELAY)
public final void scheduleWork() throws java.lang.Exception {
    com.imcode.tools.jdbmtosql.entities.DatabasesInfo dbInfo = getSchedulerHelper().findBy(getDatabaseDescription());
    java.lang.Long timestamp;
    if (dbInfo == null) {
        dbInfo = new com.imcode.tools.jdbmtosql.entities.DatabasesInfo();
        dbInfo.setHdbmDatabasesDescription(getDatabaseDescription());
        timestamp = 0L;
    }else {
        timestamp = (dbInfo.getLastProcessedTimestamp()) + 1;
    }
    java.util.List<java.lang.String> entitiesJson = getJsonDatabaseRecords(getDatabase(), timestamp);
    process(entitiesJson, dbInfo, timestamp);
}