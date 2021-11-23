private int getSupportedFPSAround(int videoFps) {
    java.util.List<int[]> supportedFps = camera.getParameters().getSupportedPreviewFpsRange();
    int currFPS = 0;
    for (int[] i : supportedFps) {
        if ((i[1]) >= (videoFps * 1000))
            return videoFps;
        
        currFPS = (i[1]) / 1000;
    }
    return currFPS;
}