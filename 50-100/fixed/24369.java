protected com.weinyc.sa.core.db.DatabaseHandler getDatabaseHandler() {
    if ((databaseHandler) == null) {
        databaseHandler = ((com.weinyc.sa.core.db.DatabaseHandler) (this.getBean("databaseHandler")));
    }
    if ((databaseHandler) == null) {
        this.databaseHandler = new com.weinyc.sa.core.db.DatabaseHandler(this.getDataSource());
    }
    return databaseHandler;
}