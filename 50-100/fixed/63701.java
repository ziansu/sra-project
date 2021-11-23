@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    if ((mPlayLists.size()) != 0) {
        mIsStop = true;
        proccessAfterComplete(mIsShuffle, mCurrentRepeat);
    }
    android.content.Intent intent = new android.content.Intent();
    intent.setAction(Config.ACTION_PLAYER_COMPLETE);
    mContext.getApplicationContext().sendBroadcast(intent);
    training.com.utils.LogUtils.printLog("onCompletion");
}