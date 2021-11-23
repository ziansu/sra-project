@java.lang.Override
public void onClick(android.view.View v) {
    btOff.setBackgroundColor(getResources().getColor(R.color.button_change));
    if (mediaPlayer.isPlaying()) {
        mediaPlayer.pause();
    }
}