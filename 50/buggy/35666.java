@java.lang.Override
public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    mItemTouchHelperAdapter.onItemDismiss(viewHolder.getAdapterPosition());
}