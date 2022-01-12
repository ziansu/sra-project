@java.lang.Override
public void onClick(android.view.View v) {
    if (mMusicService.isPlaying()) {
        mMusicService.pausePlayer();
        mPlayButton.setImageDrawable(android.support.v4.content.res.ResourcesCompat.getDrawable(getResources(), android.R.drawable.ic_media_play, null));
    }else {
        mMusicService.startPlayer();
        mPlayButton.setEnabled(false);
        mPlayButton.setImageDrawable(android.support.v4.content.res.ResourcesCompat.getDrawable(getResources(), android.R.drawable.ic_media_pause, null));
    }
}