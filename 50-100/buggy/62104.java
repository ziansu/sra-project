@java.lang.Override
protected void onDraw(antistatic.widget.wheel.Canvas canvas) {
    super.onDraw(canvas);
    if (((mViewAdapter) != null) && ((mViewAdapter.getItemsCount()) > 0)) {
        if (rebuildItems()) {
            measureLayout();
            doItemsLayout();
        }
        doItemsLayout();
        drawItems(canvas);
    }
}