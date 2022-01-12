@java.lang.Override
public void onGlobalLayout() {
    this.layout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    float width = (layout.getMeasuredWidth()) / ((float) (2));
    float height = (layout.getMeasuredHeight()) / ((float) (2));
    createSimpleSpinningDice(this.layout, width, height);
}