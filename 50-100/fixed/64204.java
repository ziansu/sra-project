public void selectAll() {
    for (int i = 0; i < (nfcTags.size()); i++) {
        android.view.View view = recyclerView.getChildAt(i);
        if (view instanceof android.support.v7.widget.CardView) {
            view.setActivated(true);
        }
        selectedItems.put(i, true);
    }
    callbacks.onItemClicked(getSelectionSize());
}