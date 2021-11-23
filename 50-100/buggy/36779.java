private boolean tableIsWanted(java.lang.String tableName) {
    boolean res = false;
    for (java.lang.String table : com.booking.replication.applier.KafkaApplier.tableList) {
        if (tableName.matches(table)) {
            res = true;
            break;
        }
    }
    for (java.lang.String exc : com.booking.replication.applier.KafkaApplier.excludeTableList) {
        if (tableName.matches(exc)) {
            return false;
        }
    }
    return res;
}