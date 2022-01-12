public void setWindowSize(int windowSize) {
    if (usingTCP) {
        this.windowSizeTCP = windowSize;
        this.currentWindow = new java.util.ArrayList<Packet>(this.windowSize);
        this.initializeWindow();
    }else {
        this.initializeWindow();
    }
}