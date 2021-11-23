@java.lang.Override
public void onTick(long millisUntilFinished) {
    soundPool.setVolume(stream, volume, volume);
    volume = (volume) - (step);
    android.util.Log.d("1", ("volume = " + (volume)));
}