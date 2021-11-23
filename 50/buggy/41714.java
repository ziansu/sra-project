public void hit() {
    float vol = 0.3F;
    com.badlogic.gdx.audio.Sound s = gameInstance.getResourceManager().hit1;
    s.stop();
    s.setPitch(s.play(vol), 5.0F);
}