@java.lang.Override
public void run() {
    grid.getHorizontalBar().setSelection(java.lang.Math.min(grid.getHorizontalBar().getMaximum(), ((grid.getHorizontalBar().getSelection()) + (com.notlob.jgrid.input.GridMouseHandler.DRAG_SCROLL_DISTANCE))));
    gridModel.fireChangeEvent();
    if (isScrollRightNeeded()) {
        grid.getDisplay().timerExec(100, this);
    }
}