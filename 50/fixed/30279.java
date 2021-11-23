@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    android.media.MediaPlayer mediaPlayer = android.media.MediaPlayer.create(this, R.raw.de_father);
    mediaPlayer.start();
}