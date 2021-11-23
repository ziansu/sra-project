@java.lang.Override
public void onClick(android.view.View view) {
    int buttonMode = ((int) (playerButton.getTag()));
    if (buttonMode == 0) {
        playerButton.setImageResource(android.R.drawable.ic_media_play);
        mPlayberService.pause();
        playerButton.setTag(1);
    }else {
        playerButton.setImageResource(android.R.drawable.ic_media_pause);
        mPlayberService.resume();
        playerButton.setTag(0);
    }
}