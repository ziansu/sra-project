public void onClick(android.view.View v) {
    if (mShortSound.isPlaying()) {
        mShortSound.stopAllTracks();
    }
    if (mShortSoundTrack.isPlaying()) {
        mShortSoundTrack.prepareAsync();
        mPlayTrackButton.setBackground(context.getResources().getDrawable(R.drawable.ic_action_play));
    }else {
        mShortSoundTrack.play();
        mPlayTrackButton.setBackground(context.getResources().getDrawable(R.drawable.ic_action_stop));
    }
}