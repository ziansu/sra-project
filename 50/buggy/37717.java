private void setPlayButton(boolean command) {
    if (command) {
        android.util.Log.d("control", "setPlayButton—play button set to pause");
        playButton.setImageResource(R.drawable.ic_pause_black_48dp);
    }else {
        android.util.Log.d("control", "setPlayButton-play button set to play");
        playButton.setImageResource(R.drawable.ic_play_arrow_black_48dp);
    }
}