public void playSoundOverMusic(final java.lang.String soundKey) {
    soundOverMusic = com.pong.system.ResourceManager.getInstance().getSound(soundKey);
    setClipVolumeToTarget(music, (-50.0F));
    playSound(soundOverMusic);
    int time = getLengthOfClipInSeconds(soundOverMusic);
    javax.swing.Timer timer = new javax.swing.Timer((time * 1000), ( arg) -> setClipVolumeToTarget(music, targetDB));
    timer.setRepeats(false);
    timer.start();
}