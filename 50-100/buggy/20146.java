@java.lang.Override
public synchronized void postSwap() {
    if (true == (isRendererRunning())) {
        bi = getOffScreenBuffer().getImage();
        imageReadyBis = true;
        if (false == (waitingForSwap)) {
            checkAppContext();
            this.lwCanvas.repaint();
        }else {
            notify();
        }
    }else {
    }
}