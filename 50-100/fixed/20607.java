@butterknife.OnClick(value = R.id.captureVideo)
void captureVideo() {
    if ((camera.getSessionType()) != (com.otaliastudios.cameraview.SessionType.VIDEO)) {
        message("Can't record video while session type is 'picture'.", false);
        return ;
    }
    if ((mCapturingPicture) || (mCapturingVideo))
        return ;
    
    mCapturingVideo = true;
    message("Recording for 8 seconds...", true);
    camera.startCapturingVideo(null, 8000);
}