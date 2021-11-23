@java.lang.Override
public void setFrameRate(double frameRate) {
    this.mFrameRate = frameRate;
    if (stopRendering()) {
        startRendering();
    }
}