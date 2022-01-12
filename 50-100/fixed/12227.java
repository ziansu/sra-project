@java.lang.Override
public void pause() {
    mBitmap = mRenderView.getBitmap();
    com.hustunique.parsingplayer.util.LogUtil.v(com.hustunique.parsingplayer.player.media.ParsingMediaManager.TAG, ((((("paused, cache thumbnail " + (mBitmap)) + " from ") + (mRenderView)) + " size ") + (mBitmap.getByteCount())));
    mCurrentPlayerProxy.pause();
}