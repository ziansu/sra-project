@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent e) {
    if ((mChicken4Count) == 0) {
        rotateImage(mChicken4);
        pink.start();
        mChicken4.setVisibility(View.INVISIBLE);
        mChicken5.setVisibility(View.VISIBLE);
    }else
        if ((mChicken4Count) == 1) {
            scaleImage(mChicken4);
            pink.start();
            mChicken4.setVisibility(View.INVISIBLE);
        }
    
    mChicken4Count += 1;
    winCheck();
    return true;
}