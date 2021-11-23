public void updateNotificationProgress(float progress) {
    if ((mTotalMediaItems) == 0)
        return ;
    
    double currentChunkProgress = ((mItemProgressSize) * progress) / 100;
    if ((mCurrentMediaItem) > 1) {
        currentChunkProgress += (mItemProgressSize) * ((mCurrentMediaItem) - 1);
    }
    mNotificationBuilder.setProgress(100, ((int) (java.lang.Math.ceil(currentChunkProgress))), false);
    mNotificationManager.notify(mNotificationId, mNotificationBuilder.build());
}