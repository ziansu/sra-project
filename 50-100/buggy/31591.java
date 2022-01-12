@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    int x = ((int) (event.getX()));
    int y = ((int) (event.getY()));
    android.graphics.Rect popup_rect = new android.graphics.Rect();
    android.graphics.Rect ball_rect = new android.graphics.Rect();
    if ((mContentView) != null) {
        mContentView.getGlobalVisibleRect(popup_rect);
    }
    if (!(popup_rect.contains(x, y))) {
        removePopView();
    }
    return false;
}