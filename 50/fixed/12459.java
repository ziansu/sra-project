@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.support.v4.app.ActivityCompat.requestPermissions(mainActivity, new java.lang.String[]{ Manifest.permission.WRITE_CONTACTS }, org.dbhatt.d_deleted_contact.Deleted_contact.REQUEST_WRITE_EXTERNAL_STORAGE);
}