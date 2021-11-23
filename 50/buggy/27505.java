@java.lang.Override
public void onItemClicked(int position, int gameID) {
    if ((actionMode) != null) {
        toggleSelection(position, gameID);
        actionMode.setTitle(((historyAdapter.getSelectedItemCount()) + " items selected"));
    }
}