@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.app.PendingIntent intent = notificationsAdapter.getItem(position).getNotification().contentIntent;
    if (intent == null)
        return ;
    
    try {
        intent.send();
        showUnlockScreen();
    } catch (android.app.PendingIntent e) {
    }
}