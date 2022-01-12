@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    android.util.Log.i(((de.ifgi.sc.smartcitiesapp.main.MainActivity.TAG) + " P2P"), "P2PManager onConnected");
    this.isConnected = true;
    if (!(subscribed)) {
        subscribe();
    }
    for (com.google.android.gms.nearby.messages.Message mPubMessage : mPubMessages) {
        if (isActive(mPubMessage)) {
            publish(mPubMessage, 5);
        }else {
            unpublish(mPubMessage);
        }
    }
}