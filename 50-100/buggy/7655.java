@java.lang.Override
public void onClick(android.view.View view) {
    mAudioService.executeAction(Constants.Action.ACTION_PLAY);
    if (isNetworkAvailable()) {
        if ((mAudioService) != null) {
            mAudioService.doStartForeground();
            btnPlay.startAnimation(playClickAnimation);
            btnPlay.setImageResource((showPlayButton ? android.R.drawable.ic_media_play : android.R.drawable.ic_media_pause));
            showPlayButton = !(showPlayButton);
        }
    }else {
        android.widget.Toast.makeText(this, getString(R.string.no_network), Toast.LENGTH_SHORT).show();
    }
}