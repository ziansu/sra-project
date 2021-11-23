public boolean onClose() {
    list.setVisibility(View.GONE);
    searchView.refreshDrawableState();
    return false;
}