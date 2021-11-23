@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    com.rohitsuratekar.NCBSinfo.database.ContactsData.makeTable(db);
    com.rohitsuratekar.NCBSinfo.database.AlarmData.makeTable(db);
    com.rohitsuratekar.NCBSinfo.database.NotificationData.makeTable(db);
    com.rohitsuratekar.NCBSinfo.database.TalkData.makeTable(db);
}