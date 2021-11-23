private void startupDatabase() {
    databaseManager = ((com.jeff.booktracker.db.DatabaseManager) (applicationContext.getBean("databaseManager")));
    databaseManager.init();
}