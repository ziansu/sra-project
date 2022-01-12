@java.lang.Override
public void onError(java.lang.String message) {
    android.util.Log.d(tv.superawesome.sdk.views.SAPlacementView.TAG, ("Error:" + message));
    if ((listener) != null)
        listener.onAdError(message);
    
}