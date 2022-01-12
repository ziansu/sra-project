@java.lang.Override
public void run() {
    final int musicVolume = getConfig().getVolume();
    float volume = 1 - ((float) ((java.lang.Math.log(0)) / (java.lang.Math.log(musicVolume))));
    mediaPlayer.setVolume(volume, volume);
    mediaPlayer.start();
}