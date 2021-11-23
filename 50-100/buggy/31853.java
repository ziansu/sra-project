private void deleteSelectedItems() {
    final android.widget.ListView overview = getOverview();
    final android.util.SparseBooleanArray selection = overview.getCheckedItemPositions();
    for (int i = 0; i < (overview.getChildCount()); ++i) {
        if (selection.get(i)) {
            fStore.deletePlaylist(fPlaylists.get(i));
        }
    }
    if ((fActionMode) != null) {
        fActionMode.finish();
    }
    reloadList();
}