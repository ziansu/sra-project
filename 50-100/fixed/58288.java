public static void update(boolean fillNextBuffer) {
    if (!(kuusisto.tinysound.TinySound.inited)) {
        java.lang.System.err.println("TinySound not initialized!");
        return ;
    }
    if (((kuusisto.tinysound.TinySound.numBytesRead) <= 0) && (!fillNextBuffer)) {
        kuusisto.tinysound.TinySound.fillAudioBuffer();
    }
    int numBytesWritten = 0;
    while (numBytesWritten < (kuusisto.tinysound.TinySound.numBytesRead)) {
        numBytesWritten += kuusisto.tinysound.TinySound.outLine.write(kuusisto.tinysound.TinySound.audioBuffer, numBytesWritten, kuusisto.tinysound.TinySound.numBytesRead);
    } 
    kuusisto.tinysound.TinySound.numBytesRead = 0;
    if (fillNextBuffer) {
        kuusisto.tinysound.TinySound.fillAudioBuffer();
    }
}