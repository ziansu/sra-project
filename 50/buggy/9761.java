@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    tdd.tracker.hobby.hobbytrackerincremental.database.TableManager tableAdmin = tdd.tracker.hobby.hobbytrackerincremental.database.TableManager.getInstance();
    for (tdd.tracker.hobby.hobbytrackerincremental.database.Table t : tableAdmin.getTables())
        t.createTable(db);
    
}