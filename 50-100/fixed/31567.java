@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.os.Bundle extras = intent.getExtras();
    android.net.NetworkInfo info = ((android.net.NetworkInfo) (extras.getParcelable("networkInfo")));
    if (info != null) {
        android.net.NetworkInfo.State state = info.getState();
        if (state == (NetworkInfo.State.CONNECTED)) {
            enableApp();
            initializeIAB();
        }else {
            disableApp();
            disposeIAB();
        }
    }
}