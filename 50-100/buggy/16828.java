@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(ru.mit.au.spb.olga.catendar.model.DatabaseHelper.DATABASE_CREATE_WEEK_TABLE_SCRIPT);
    db.execSQL(ru.mit.au.spb.olga.catendar.model.DatabaseHelper.DATABASE_CREATE_TEMPLATES_IN_WEEK_SCRIPT);
    db.execSQL(ru.mit.au.spb.olga.catendar.model.DatabaseHelper.DATABASE_CREATE_TEMPLATE_TABLE_SCRIPT);
    db.execSQL(ru.mit.au.spb.olga.catendar.model.DatabaseHelper.DATABASE_CREATE_EVENT_TABLE_SCRIPT);
    db.execSQL(ru.mit.au.spb.olga.catendar.model.DatabaseHelper.DATABASE_CREATE_TASK_TABLE_SCRIPT);
    db.execSQL(ru.mit.au.spb.olga.catendar.model.DatabaseHelper.DATABASE_CREATE_TASK_HEAP_TABLE_SCRIPT);
    db.execSQL(ru.mit.au.spb.olga.catendar.model.DatabaseHelper.DATABASE_CREATE_HEAP_TABLE_SCRIPT);
}