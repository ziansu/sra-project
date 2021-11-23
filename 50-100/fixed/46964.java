@java.lang.Override
public boolean onSingleTapConfirmed(android.view.MotionEvent e) {
    float x = e.getX();
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