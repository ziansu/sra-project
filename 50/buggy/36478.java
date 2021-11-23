@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    new com.rohitsuratekar.NCBSinfo.database.ContactsData(context).makeTable();
    new com.rohitsuratekar.NCBSinfo.database.AlarmData(context).makeTable();
    new com.rohitsuratekar.NCBSinfo.database.NotificationData(context).makeTable();
    new com.rohitsuratekar.NCBSinfo.database.TalkData(context).makeTable();
}