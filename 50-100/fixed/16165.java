private void doVideoEncode(byte[] frame) {
    if (((inProcessing) == true) || ((cameraView) != null)) {
        return ;
    }
    inProcessing = true;
    int picWidth = cameraView.Width();
    int picHeight = cameraView.Height();
    int size = (picWidth * picHeight) + ((picWidth * picHeight) / 2);
    java.lang.System.arraycopy(frame, 0, yuvFrame, 0, size);
    executor.execute(videoTask);
}