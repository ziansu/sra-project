@org.junit.Before
public void setUp() throws java.lang.Exception {
    android.content.Context context = android.support.test.InstrumentationRegistry.getTargetContext();
    context.deleteDatabase(DBHandler.DATABASE_NAME);
    dbh = new at.sw2017.pocketdiary.database_access.DBHandler(context);
    dbe = new at.sw2017.pocketdiary.database_access.DBEntry(context);
    dba = new at.sw2017.pocketdiary.database_access.DBAddress(context);
    dbp = new at.sw2017.pocketdiary.database_access.DBPicture(context);
}