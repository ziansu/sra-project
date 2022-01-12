@java.lang.Override
public boolean onTouch(com.hbpu.Util.View v, com.hbpu.Util.MotionEvent event) {
    int x = ((int) (event.getX()));
    int y = ((int) (event.getY()));
    com.hbpu.Util.Rect rect = new com.hbpu.Util.Rect();
    mContentView.getGlobalVisibleRect(rect);
    if (!(rect.contains(x, y))) {
        removePoppedViewAndClear();
    }
    return false;
}