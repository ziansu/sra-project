@java.lang.Override
public void onSuccess(final java.lang.Float volume) {
    if (volume >= 1.0) {
        com.connectsdk.core.Util.postSuccess(listener, null);
    }else {
        float newVolume = ((float) (volume + 0.01));
        if (newVolume > 1.0)
            newVolume = ((float) (1.0));
        
        setVolume(newVolume, listener);
        com.connectsdk.core.Util.postSuccess(listener, null);
    }
}