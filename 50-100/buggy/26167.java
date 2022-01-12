public void setAspectRatio(int aspectRatio) {
    for (int i = 0; i < (com.dou361.ijkplayer.widget.IjkVideoView.s_allAspectRatio.length); i++) {
        if ((com.dou361.ijkplayer.widget.IjkVideoView.s_allAspectRatio[i]) == aspectRatio) {
            mCurrentAspectRatioIndex = i;
            if ((mRenderView) != null) {
                mRenderView.setAspectRatio(mCurrentAspectRatio);
            }
            break;
        }
    }
}