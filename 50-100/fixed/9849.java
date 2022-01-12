public void playMusic(android.view.View view) {
    if (DEBUG)
        android.util.Log.d(com.vibejukebox.jukebox.activities.JukeboxPlaylistActivity.TAG, "playMusic -- (View)");
    
    android.widget.ImageButton playButton = ((android.widget.ImageButton) (findViewById(R.id.playButton)));
    if (mCurrentPlayerState.playing) {
        mChangeTrack = false;
        mPlayer.pause();
        playButton.setImageDrawable(getResources().getDrawable(R.drawable.play));
    }else {
        mPlayer.resume();
        mChangeTrack = true;
        playButton.setImageDrawable(getResources().getDrawable(R.drawable.pause));
    }
}