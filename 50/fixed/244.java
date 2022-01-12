@java.lang.Override
public int getMovementFlags(android.support.v7.widget.RecyclerView recyclerView, android.support.v7.widget.RecyclerView.ViewHolder viewHolder) {
    int dragFlags = (android.support.v7.widget.helper.ItemTouchHelper.UP) | (android.support.v7.widget.helper.ItemTouchHelper.DOWN);
    int swipeFlags = android.support.v7.widget.helper.ItemTouchHelper.START;
    return makeMovementFlags(dragFlags, swipeFlags);
}