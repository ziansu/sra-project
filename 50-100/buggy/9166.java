@android.support.annotation.VisibleForTesting
void setVideoPath(java.lang.String path) {
    if ((mPlayer) == null)
        mPlayer = createPlayer(mContext);
    
    try {
        mPlayer.setDataSource(mContext, android.net.Uri.parse(path));
        openVideo();
    } catch (java.io.IOException e) {
        com.hustunique.parsingplayer.util.LogUtil.wtf(com.hustunique.parsingplayer.player.media.ParsingPlayerProxy.TAG, e);
        e.printStackTrace();
    }
}