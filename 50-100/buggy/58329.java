@java.lang.Override
public void onUploadCompleted() {
    java.lang.System.out.println(("deleting from sync_Report --------- " + (data.id)));
    db.execSQL((("delete from sync_report where id = " + (data.id)) + ""));
    cursor.close();
    closeDB();
    android.widget.Toast.makeText(this, "Report posted successfully!", Toast.LENGTH_SHORT).show();
}