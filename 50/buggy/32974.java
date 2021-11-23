@java.lang.Override
public void run() {
    if ((client) == null) {
        android.util.Log.v(TDDatabase.TAG, "cannot notify client, client is null");
    }else {
        android.util.Log.v(TDDatabase.TAG, "about to notify client");
        copy.changeTrackerReceivedChange(change);
    }
}