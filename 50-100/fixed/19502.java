@java.lang.Override
public void onGlobalLayout() {
    this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    this.viewWidth = this.getMeasuredWidth();
    this.viewHeight = this.getMeasuredHeight();
    if ((this.listener) != null) {
        this.listener.setSize(this.viewWidth, this.viewHeight);
    }
}