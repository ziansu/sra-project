public void start(@android.support.annotation.NonNull
android.content.Context context) throws org.thoughtcrime.redphone.audio.AudioException {
    if ((Build.VERSION.SDK_INT) >= 11) {
        org.thoughtcrime.securesms.util.ServiceUtil.getAudioManager(context).setMode(AudioManager.MODE_IN_COMMUNICATION);
    }else {
    }
    try {
        start(handle);
    } catch (org.thoughtcrime.redphone.audio.NativeAudioException | java.lang.NoSuchMethodError e) {
        android.util.Log.w(org.thoughtcrime.redphone.audio.CallAudioManager.TAG, e);
        throw new org.thoughtcrime.redphone.audio.AudioException("Sorry, there was a problem initiating the audio on your device.");
    }
}