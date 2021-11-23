@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.os.Bundle bundle = intent.getExtras();
    if ((gridView) != null)
        gridViewUser.hideRequestAnnouncement();
    
}