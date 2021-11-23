@java.lang.Override
public void onCaptureRegionMoved(int x, int y) {
    ssi.x = x;
    ssi.y = y;
    if ((sharer) != null)
        sharer.setCaptureCoordinates(x, y);
    
}