private void initializeTWatch() {
    player = new edu.umich.eecs.twatchw.Player(this);
    tap = new edu.umich.eecs.twatchw.SpiralBuffer("BTap", this);
    recorder = new edu.umich.eecs.twatchw.Recorder(this, tap);
    recorder.startRecording();
    player.turnOffSound(true);
    player.setSpace(((int) (0.05 * 44100)));
    player.startPlaying();
}