private void onRemoveItemsClicked(java.util.Set<com.sawyer.advadapters.app.data.MovieItem> items) {
    if ((items.size()) == 1) {
        getListAdapter().remove(items.iterator().next());
    }else {
        getListAdapter().removeAll(items);
    }
}