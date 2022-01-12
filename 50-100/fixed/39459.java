@java.lang.Override
public void onStartCapture(int x, int y, int width, int height) {
    ssi.x = x;
    ssi.y = y;
    ssi.captureWidth = width;
    ssi.captureHeight = height;
    ssi.scaleWidth = width;
    ssi.scaleHeight = height;
    sharer.updateScreenShareInfo(x, y, width, height);
    sharer.addClientListener(listener);
    sharer.startSharing();
    signalChannel.startSharing(width, height);
}