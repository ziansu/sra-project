@org.junit.Test
public void detectOnScrollRight() {
    android.view.MotionEvent ev1 = android.view.MotionEvent.obtain(10, 10, 0, 200, 0, 0);
    android.view.MotionEvent ev2 = android.view.MotionEvent.obtain(10, 10, 0, 50, 0, 0);
    testTouchTypeDetector.listener.onScroll(ev1, ev2, 0, 0);
    org.mockito.Mockito.verify(mockListener, org.mockito.Mockito.only()).onScroll(com.github.nisrulz.sensey.TouchTypeDetector.SCROLL_DIR_RIGHT);
}