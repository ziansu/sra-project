public void onClick(android.view.View v) {
    if (mShortSoundTrack.isPlaying()) {
        mShortSoundTrack.stop();
        mShortSoundTrack.prepareAsync();
        mPlayTrackButton.setBackground(context.getResources().getDrawable(R.drawable.ic_action_play));
    }else {
        mShortSound.stopAllTracks();
        mShortSoundTrack.play();
        mPlayTrackButton.setBackground(context.getResources().getDrawable(R.drawable.ic_action_stop));
    }
}