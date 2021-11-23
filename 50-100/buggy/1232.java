@java.lang.Override
public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int swipeDir) {
    if (swipeDir == 8) {
        final int position = viewHolder.getAdapterPosition();
        removeCity(mAdapter.getItem(position).getName());
        mAdapter.removeItem(position);
        mAdapter.notifyItemRemoved(position);
    }
}