@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent e) {
    if ((mChicken1Count) == 0) {
        rotateImage(mChicken1);
        mChicken1.setVisibility(View.INVISIBLE);
        yellow.start();
        mChicken2.setVisibility(View.VISIBLE);
    }else
        if ((mChicken1Count) >= 1) {
            scaleImage(mChicken1);
            mChicken1.setVisibility(View.INVISIBLE);
            yellow.start();
        }
    
    mChicken1Count += 1;
    winCheck();
    return true;
}