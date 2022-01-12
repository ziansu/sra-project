@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    android.util.Log.i(name.chadschultz.nearbyapidemo.MainActivity.TAG, "onConnected()");
    subscribe();
}