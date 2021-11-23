public void setWindowSize(int windowSize) {
    if (usingTCP) {
        this.windowSizeTCP = windowSize;
        this.currentWindow = new java.util.ArrayList<Packet>(this.windowSizeTCP);
        this.initializeWindow();
    }else {
        this.initializeWindow();
    }
}