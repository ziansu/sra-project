@java.lang.Override
public boolean onFling(android.view.MotionEvent e1, android.view.MotionEvent e2, float velocityX, float velocityY) {
    if (velocityY > (com.ted.coder.sdlayout.ScrollDownLayout.FLING_VELOCITY_SLOP)) {
        if ((getCurrentStatus().equals(com.ted.coder.sdlayout.ScrollDownLayout.Status.OPENED)) && (isSupportExit())) {
            scrollToExit();
        }else {
            scrollToOpen();
        }
        return true;
    }else
        if (velocityY < (com.ted.coder.sdlayout.ScrollDownLayout.FLING_VELOCITY_SLOP)) {
            scrollToClose();
            return true;
        }
    
    return false;
}