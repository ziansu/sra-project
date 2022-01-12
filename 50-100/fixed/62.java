@java.lang.Override
public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int width, int height) {
    android.util.Log.e("OnVideo", "Surface Available");
    if (((mState) != (com.dd.crop.TextureVideoView.State.END)) && (!(mPreventPlayback))) {
        android.view.Surface surface = new android.view.Surface(surfaceTexture);
        mMediaPlayer.setSurface(surface);
        mIsViewAvailable = true;
        updateTextureViewSize();
        if (((mIsDataSourceSet) && (mIsPlayCalled)) && (mIsVideoPrepared)) {
            com.dd.crop.TextureVideoView.log("View is available and play() was called.");
            play();
        }
    }
}