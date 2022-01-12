@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    if (preference.getKey().equals(getResources().getString(R.string.key_mov_speed))) {
        android.util.Log.d(lsa.viewercloudpoints.MyGLSurfaceView.TAG, ("MovementSpeed changed: " + newValue));
        speedMultiTouch = calculateSpeedMultiTouch(((int) (newValue)));
    }
    return true;
}