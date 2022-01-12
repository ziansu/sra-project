@java.lang.Override
public void onSurfaceTextureSizeChanged(final android.graphics.SurfaceTexture surface, final int width, final int height) {
    mSurfaceWidth = width;
    mSurfaceHeight = height;
    boolean isValidState = (mTargetState) == (com.sprylab.android.widget.TextureVideoView.STATE_PLAYING);
    boolean hasValidSize = ((mVideoWidth) == width) && ((mVideoHeight) == height);
    if ((((mMediaPlayer) != null) && isValidState) && hasValidSize) {
        if ((mSeekWhenPrepared) != 0) {
            seekTo(mSeekWhenPrepared);
        }
        start();
    }
}