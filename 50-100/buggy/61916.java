public static void shutdown() {
    if (!(kuusisto.tinysound.TinySound.inited)) {
        return ;
    }
    kuusisto.tinysound.TinySound.inited = false;
    kuusisto.tinysound.TinySound.outLine.stop();
    kuusisto.tinysound.TinySound.outLine.flush();
    kuusisto.tinysound.TinySound.mixer.clearMusic();
    kuusisto.tinysound.TinySound.mixer.clearSounds();
    kuusisto.tinysound.TinySound.mixer = null;
    kuusisto.tinysound.TinySound.updateRate = 0;
    kuusisto.tinysound.TinySound.audioBuffer = null;
    kuusisto.tinysound.TinySound.numBytesRead = 0;
    kuusisto.tinysound.TinySound.driftFramesPerUpdate = 0.0;
    kuusisto.tinysound.TinySound.driftFramesAccrued = 0.0;
    if (kuusisto.tinysound.TinySound.autoUpdate) {
        kuusisto.tinysound.TinySound.autoUpdater.stop();
        kuusisto.tinysound.TinySound.autoUpdater = null;
        kuusisto.tinysound.TinySound.autoUpdate = false;
    }
}