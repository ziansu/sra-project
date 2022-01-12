@java.lang.Override
public void onResume() {
    super.onResume();
    mHumanMediaPlayer = android.media.MediaPlayer.create(getApplicationContext(), R.raw.x_sound);
}