public void play() throws javax.sound.sampled.LineUnavailableException {
    this.frequenz = frequenz;
    sdl.open(audioFormat, sampleRate);
    sdl.start();
    setChannel();
    isPlaying = true;
    new java.lang.Thread() {
        public void run() {
            while (isPlaying) {
                byte[] buffer;
                buffer = createSinWaveBuffer(1000);
                sdl.write(buffer, 0, buffer.length);
            } 
        }
    }.start();
}