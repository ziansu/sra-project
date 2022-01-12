@java.lang.Override
public void onTick(long millisUntilFinished) {
    volume = (volume) - (step);
    soundPool.setVolume(stream, volume, volume);
}