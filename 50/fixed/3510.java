public void clearItemSelection() {
    listAdapter.clearSelection();
    if ((actionMode) != null)
        actionMode.finish();
    
    actionMode = null;
    toolbar.setVisibility(View.VISIBLE);
}