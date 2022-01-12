@android.support.annotation.VisibleForTesting
void setVideoPath(java.lang.String path) {
    if ((mPlayer) == null)
        mPlayer = createPlayer(mContext.get());
    
    try {
        mPlayer.setDataSource(mContext.get(), android.net.Uri.parse(path));
        openVideo();
    } catch (java.io.IOException e) {
        com.hustunique.parsingplayer.util.LogUtil.wtf(com.hustunique.parsingplayer.player.media.ParsingPlayerProxy.TAG, e);
        e.printStackTrace();
    }
}