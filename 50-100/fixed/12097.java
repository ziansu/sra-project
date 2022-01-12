public void setDragSortListView() {
    dragSortController = new com.mobeta.android.dslv.DragSortController(dslv);
    dragSortController.setDragHandleId(R.id.order_button);
    dragSortController.setSortEnabled(false);
    dragSortController.setDragInitMode(0);
    dslv.setFloatViewManager(dragSortController);
    dslv.setOnTouchListener(dragSortController);
    dslv.setDragEnabled(true);
}