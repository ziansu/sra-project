@java.lang.Override
public void onClick(android.view.View view) {
    if (isNetworkAvailable()) {
        if ((mAudioService) != null) {
            mAudioService.executeAction(Constants.Action.ACTION_PLAY);
            mAudioService.doStartForeground();
            btnPlay.startAnimation(playClickAnimation);
            btnPlay.setImageResource((showPlayButton ? android.R.drawable.ic_media_play : android.R.drawable.ic_media_pause));
        }
    }else {
        android.widget.Toast.makeText(this, getString(R.string.no_network), Toast.LENGTH_SHORT).show();
    }
}