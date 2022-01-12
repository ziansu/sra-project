@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    if ((com.google.firebase.auth.FirebaseAuth.getInstance().getCurrentUser()) != null) {
        if ((transportRequestHandler) == null) {
            transportRequestHandler = new firebase.TransportRequestHandler(this);
            addNotification();
        }
    }
    return START_STICKY;
}