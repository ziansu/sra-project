public void playMusic(android.view.View view) {
    if (DEBUG)
        android.util.Log.d(com.vibejukebox.jukebox.activities.JukeboxPlaylistActivity.TAG, "playMusic -- (View)");
    
    mChangeTrack = false;
    android.widget.ImageButton playButton = ((android.widget.ImageButton) (findViewById(R.id.playButton)));
    if (mCurrentPlayerState.playing) {
        mPlayer.pause();
        playButton.setImageDrawable(getResources().getDrawable(R.drawable.play));
    }else {
        mPlayer.resume();
        playButton.setImageDrawable(getResources().getDrawable(R.drawable.pause));
    }
}