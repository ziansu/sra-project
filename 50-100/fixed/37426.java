private void initDatabase() {
    db = openOrCreateDatabase("memo.db", win.cycoe.memo.MODE_PRIVATE, null);
    dbHandler = new win.cycoe.memo.Handler.DatabaseHandler(db);
    dbHandler.readTables();
    if ((dbHandler.tbList.length) == 0)
        dbHandler.createTable("默认");
    
    dbHandler.readTables();
    dbHandler.handle(dbHandler.tbList[currentPos]);
    dbHandler.readDatabase();
}