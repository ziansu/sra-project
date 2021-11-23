@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    this.holder = holder;
    if ((videoPauseFlag) && ((currVideoModel) != null)) {
        videoPauseFlag = false;
        playVideo(currVideoModel);
    }
}