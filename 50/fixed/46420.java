@java.lang.Override
public void onClick(android.view.View view) {
    if (mServiceBound)
        mBoundService.togglePlayer();
    
    playPreviousSong();
}