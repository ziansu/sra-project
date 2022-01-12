public boolean onClose() {
    searchView.refreshDrawableState();
    list.setVisibility(View.GONE);
    return false;
}