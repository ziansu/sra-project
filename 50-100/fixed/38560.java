@java.lang.Override
public final synchronized void close() {
    com.sarality.db.SQLiteTable.logger.debug("Closing database for Table {} ", tableDefinition.getTableName());
    if ((dbOpenCounter.decrementAndGet()) == 0) {
        if ((this.database) != null) {
            this.database.close();
            com.sarality.db.SQLiteTable.logger.info("Closed database for Table {} ", tableDefinition.getTableName());
        }
    }
}