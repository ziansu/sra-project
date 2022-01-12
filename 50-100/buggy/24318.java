public void addAll(int position, java.util.List items) {
    setHasNewItems(((items != null) && ((items.size()) > 0)));
    try {
        int insertPosition = calcInsertPosition(position);
        mItems.addAll(insertPosition, items);
        com.e16din.simplerecycler.adapter.SimpleRecyclerAdapter.notifyItemRangeInserted(insertPosition, items.size());
    } catch (java.lang.IllegalStateException e) {
        e.printStackTrace();
    }
}