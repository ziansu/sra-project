@java.lang.Override
protected void updateView() {
    if (rebuildItems()) {
        calculateLayoutHeight(getHeight(), MeasureSpec.EXACTLY);
        doLayout(getWidth(), getHeight(), false);
    }
}