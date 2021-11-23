private void release() {
    com.huhx0015.hxaudio.utils.HXLog.d(com.huhx0015.hxaudio.audio.HXSound.LOG_TAG, "RELEASE: release(): Releasing all HXSoundEngine instances...");
    if ((hxSoundEngines) != null) {
        int i = 0;
        for (int x : new int[numberOfEngines]) {
            hxSoundEngines.get(i).release();
            com.huhx0015.hxaudio.utils.HXLog.d(com.huhx0015.hxaudio.audio.HXSound.LOG_TAG, (("RELEASE: release(): HXSoundEngine (" + i) + ") is released."));
            i++;
        }
        hxSoundEngines = null;
    }
    com.huhx0015.hxaudio.audio.HXSound.hxSound = null;
}