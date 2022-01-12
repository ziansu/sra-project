@java.lang.Override
public boolean onFling(android.view.MotionEvent e1, android.view.MotionEvent e2, float velocityX, float velocityY) {
    this.onFling(velocityX);
    return super.onFling(e1, e2, velocityX, velocityY);
}