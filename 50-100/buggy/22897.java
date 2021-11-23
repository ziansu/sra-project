void release() {
    if ((soundPool) != null) {
        soundPool.release();
        soundPool = null;
        soundEffectMap.clear();
        com.huhx0015.hxaudio.utils.HXLog.d(com.huhx0015.hxaudio.audio.HXSoundEngine.LOG_TAG, (("RELEASE (" + (engineID)) + "): release(): SoundPool object has been released."));
    }else {
        com.huhx0015.hxaudio.utils.HXLog.e(com.huhx0015.hxaudio.audio.HXSoundEngine.LOG_TAG, (("ERROR (" + (engineID)) + "): release(): SoundPool object is null and cannot be released."));
    }
}