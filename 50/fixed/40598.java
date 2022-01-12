@java.lang.Override
public void removeFromRecyclerView(int position) {
    if ((pendingList.size()) > 0) {
        pendingList.remove(position);
        recyclerView.getAdapter().notifyItemRemoved(position);
    }
}