@java.lang.Override
public void run() {
    grid.getHorizontalBar().setSelection(java.lang.Math.max(grid.getHorizontalBar().getMinimum(), ((grid.getHorizontalBar().getSelection()) - 1)));
    gridModel.fireChangeEvent();
    if (isScrollLeftNeeded()) {
        grid.getDisplay().timerExec(100, this);
    }
}