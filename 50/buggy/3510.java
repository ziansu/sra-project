public void clearItemSelection() {
    listAdapter.clearSelection();
    actionMode.finish();
    actionMode = null;
    toolbar.setVisibility(View.VISIBLE);
}