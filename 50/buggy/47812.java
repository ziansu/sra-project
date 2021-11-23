@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    Wearable.DataApi.addListener(mGoogleApiClient, this);
    if (android.util.Log.isLoggable(LOG_TAG, Log.DEBUG)) {
        android.util.Log.d(LOG_TAG, "onConnected");
    }
}