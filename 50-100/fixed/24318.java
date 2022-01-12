public void addAll(int position, java.util.List items) {
    if ((items == null) || ((items.size()) == 0)) {
        return ;
    }
    setHasNewItems(((items.size()) > 0));
    try {
        int insertPosition = calcInsertPosition(position);
        mItems.addAll(insertPosition, items);
        com.e16din.simplerecycler.adapter.SimpleRecyclerAdapter.notifyItemRangeInserted(insertPosition, items.size());
    } catch (java.lang.IllegalStateException e) {
        e.printStackTrace();
    }
}