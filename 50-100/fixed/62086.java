private static void setSpeakerphoneOn(boolean isInCall, boolean isSpeakerOn) {
    org.matrix.androidsdk.util.Log.d(im.vector.util.VectorCallSoundManager.LOG_TAG, ("setCallSpeakerphoneOn " + isSpeakerOn));
    im.vector.util.VectorCallSoundManager.backupAudioConfig();
    android.media.AudioManager audioManager = im.vector.util.VectorCallSoundManager.getAudioManager();
    int audioMode = (isInCall) ? android.media.AudioManager.MODE_IN_COMMUNICATION : android.media.AudioManager.MODE_RINGTONE;
    if ((audioManager.getMode()) != audioMode) {
        audioManager.setMode(audioMode);
    }
    audioManager.setSpeakerphoneOn(isSpeakerOn);
    im.vector.util.VectorCallSoundManager.sIsSpeakerOn = isSpeakerOn;
}