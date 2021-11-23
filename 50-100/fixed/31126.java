public void play(final boolean loop, final java.awt.geom.Point2D location, final float gain) {
    if ((this.dataLine) != null) {
        return ;
    }
    this.gain = gain;
    this.location = location;
    final de.gurkenlabs.litiengine.sound.SoundSource.PlayThread thread = new de.gurkenlabs.litiengine.sound.SoundSource.PlayThread(loop);
    thread.start();
    this.played = true;
}