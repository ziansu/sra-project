@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent e) {
    if ((mChicken3Count) == 0) {
        fadeOutImage(mChicken3);
        red.start();
        mChicken3.setVisibility(View.INVISIBLE);
        mChicken4.setVisibility(View.VISIBLE);
    }else
        if ((mChicken3Count) >= 1) {
            rotateImage(mChicken3);
            mChicken3.setVisibility(View.INVISIBLE);
            red.start();
        }
    
    mChicken3Count += 1;
    winCheck();
    return true;
}