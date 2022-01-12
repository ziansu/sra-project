@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent data) {
    java.lang.String action = data.getAction();
    if (action.equals(com.auth0.android.lock.Lock.AUTHENTICATION_ACTION)) {
        processEvent(data);
    }else
        if (action.equals(com.auth0.android.lock.Lock.CANCELED_ACTION)) {
            callback.onCanceled();
        }
    
}