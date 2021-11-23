@java.lang.Override
public int getMovementFlags(android.support.v7.widget.RecyclerView recyclerView, android.support.v7.widget.RecyclerView.ViewHolder viewHolder) {
    int dragFlags = (((android.support.v7.widget.helper.ItemTouchHelper.UP) | (android.support.v7.widget.helper.ItemTouchHelper.DOWN)) | (android.support.v7.widget.helper.ItemTouchHelper.RIGHT)) | (android.support.v7.widget.helper.ItemTouchHelper.LEFT);
    int swipeFlags = (android.support.v7.widget.helper.ItemTouchHelper.START) | (android.support.v7.widget.helper.ItemTouchHelper.END);
    return makeMovementFlags(dragFlags, swipeFlags);
}