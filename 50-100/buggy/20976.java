@java.lang.Override
public void run() {
    grid.getHorizontalBar().setSelection(java.lang.Math.max(grid.getHorizontalBar().getMinimum(), ((grid.getHorizontalBar().getSelection()) - (com.notlob.jgrid.input.GridMouseHandler.DRAG_SCROLL_DISTANCE))));
    gridModel.fireChangeEvent();
    if (isScrollLeftNeeded()) {
        grid.getDisplay().timerExec(100, this);
    }
}