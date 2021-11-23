@java.lang.Override
public void onSurfaceTextureSizeChanged(final android.graphics.SurfaceTexture surface, final int width, final int height) {
    mSurfaceWidth = width;
    mSurfaceHeight = height;
    boolean isValidState = (mTargetState) == (com.sprylab.android.widget.TextureVideoView.STATE_PLAYING);
    boolean hasValidSize = (width > 0) && (height > 0);
    if ((((mMediaPlayer) != null) && isValidState) && hasValidSize) {
        if ((mSeekWhenPrepared) != 0) {
            seekTo(mSeekWhenPrepared);
        }
        start();
    }
}