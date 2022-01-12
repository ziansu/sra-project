@java.lang.Override
public void setEnabled(final boolean enabled) {
    super.setEnabled(enabled);
    if (!enabled) {
        cameraFrame.dispose();
        com.funkydonkies.gamestates.CameraState.cameraOpened = false;
    }else {
        cameraFrame = new com.funkydonkies.camdetect.MyFrame();
        bridge = cameraFrame.getVideoCap().getMat2Image();
        new java.lang.Thread(cameraFrame).start();
        com.funkydonkies.gamestates.CameraState.cameraOpened = true;
    }
}