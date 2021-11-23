@java.lang.Override
public void onGlobalLayout() {
    this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    this.viewWidth = this.getMeasuredWidth();
    this.viewHeight = this.getMeasuredHeight();
    if ((this.listener) != null) {
        this.listener.setSize(this.viewWidth, this.viewHeight);
    }
    if ((this.mode) == (de.peterloos.beziersplines.utils.BezierMode.Demo)) {
        this.holder.computeDemoRectangle(this.viewWidth, this.viewHeight);
    }
}