@java.lang.Override
public void onViewReleased(android.view.View releasedChild, float xvel, float yvel) {
    super.onViewReleased(releasedChild, xvel, yvel);
    for (com.daimajia.swipe.SwipeLayout.SwipeListener l : mSwipeListeners) {
        l.onHandRelease(this, xvel, yvel);
    }
    processHandRelease(xvel, yvel, isCloseBeforeDrag);
    invalidate();
}