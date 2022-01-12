@java.lang.Override
public boolean onSingleTapConfirmed(android.view.MotionEvent e) {
    float x = e.getX();
    java.lang.System.out.format("TAP %f %d %n", x, this.getWidth());
    if (x >= ((this.getWidth()) - (mTapBoundary))) {
        invokeGesture(com.sketchpunk.ocomicreader.ui.GestureImageView.TAPRIGHT);
        return true;
    }else
        if (x <= (mTapBoundary)) {
            invokeGesture(com.sketchpunk.ocomicreader.ui.GestureImageView.TAPLEFT);
            return true;
        }
    
    return false;
}