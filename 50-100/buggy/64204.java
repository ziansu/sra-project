public void selectAll() {
    for (int i = 0; i < (nfcTags.size()); i++) {
        android.view.View view = recyclerView.getChildAt(i);
        if (view instanceof android.support.v7.widget.CardView) {
            selectedItems.put(i, true);
            view.setActivated(true);
        }
    }
    callbacks.onItemClicked(getSelectionSize());
}