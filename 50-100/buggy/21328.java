@java.lang.Override
public void onServiceConnected(android.content.ComponentName className, android.os.IBinder binder) {
    service = ((de.tubs.androidlab.instameet.service.InstaMeetServiceBinder) (binder)).getService();
    service.processor.listener.addListener(listener);
    service.fetchOwnData();
    itemFriendRequest.setVisible(service.areNewFriendRequests());
}