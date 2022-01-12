@java.lang.Override
public boolean onLongClick(android.view.View v) {
    isActionMode = true;
    actionMode = ((com.awchoudhary.bookpocket.TabManagerActivity) (context)).startSupportActionMode(new com.awchoudhary.bookpocket.NotesAdapter.ActionModeCallback());
    if ((actionMode) == null) {
        return false;
    }
    toggleSelection(position, noteViewHolder.cv);
    actionMode.setTitle(java.lang.Integer.toString(getSelectedItemCount()));
    return true;
}