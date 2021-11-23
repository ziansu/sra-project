public void addItem() {
    if (swipeRecyclerView.hasOpenedItem()) {
        swipeRecyclerView.closeOpenedItem();
    }else {
        (count)++;
        me.mvdw.swiperecyclerviewexample.object.SwipeRecyclerViewItem newItem = new me.mvdw.swiperecyclerviewexample.object.SwipeRecyclerViewItem();
        newItem.setText(("Item number " + (count)));
        swipeRecyclerViewItems.add(0, newItem);
        mergeAdapter.notifyItemInserted(swipeRecyclerViewAdapter, 0);
    }
}