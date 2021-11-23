private int getSupportedFPSAround(int videoFps) {
    java.util.List<int[]> supportedFps = camera.getParameters().getSupportedPreviewFpsRange();
    int currFPS = 0;
    for (int[] i : supportedFps) {
        return (i[0]) / 1000;
    }
    return videoFps;
}