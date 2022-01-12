@java.lang.Override
public void onConnected(android.os.Bundle connectionHint) {
    if (android.util.Log.isLoggable(com.example.android.sunshine.app.DigitalWatchFaceService.TAG, Log.DEBUG)) {
        android.util.Log.d(com.example.android.sunshine.app.DigitalWatchFaceService.TAG, ("onConnected: " + connectionHint));
    }
    requestWeatherDataToPhone();
}