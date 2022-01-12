@java.lang.Override
public void run() {
    boolean finish = (!(mScroller.computeScrollOffset())) || (mScroller.isFinished());
    int currY = mScroller.getCurrY();
    int yDiff = currY - (mmLastY);
    if (finish) {
        finish();
    }else {
        mmLastY = currY;
        updateScroll(yDiff);
        post(this);
    }
}