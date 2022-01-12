private boolean shouldCancelDragOnDataUpdated() {
    return (!(com.h6ah4i.android.widget.advrecyclerview.draggable.DraggableItemWrapperAdapter.DEBUG_BYPASS_MOVE_OPERATION_MODE)) && (isDragging());
}