@java.lang.Override
public void onLoadComplete(android.media.SoundPool soundPool, int sampleId, int status) {
    com.huhx0015.hxaudio.utils.HXLog.d(com.huhx0015.hxaudio.audio.HXSoundEngine.LOG_TAG, (("READY (" + (engineID)) + "): onLoadComplete(): The SoundPool object is ready."));
    playSoundFx(sampleId, isLoop, volume);
}