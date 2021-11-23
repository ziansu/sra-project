@java.lang.Override
public void onDismissedBySwipeLeft(android.support.v7.widget.RecyclerView recyclerView, int[] reverseSortedPositions) {
    for (int position : reverseSortedPositions) {
        _data.remove(position);
        deleteItemFromCloud(position);
        _rAdapter.notifyItemRemoved(position);
    }
    _rAdapter.notifyDataSetChanged();
}