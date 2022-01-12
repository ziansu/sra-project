@java.lang.Override
public void onDeleteClicked(int position) {
    swipeRecyclerViewItems.remove(position);
    swipeRecyclerViewAdapter.notifyItemRemoved(position);
    swipeRecyclerView.closeOpenedItem();
}