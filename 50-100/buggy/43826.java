@java.lang.Override
public boolean onLongClick(android.view.View v) {
    isActionMode = true;
    v.setActivated((v.isActivated() ? false : true));
    actionMode = ((com.awchoudhary.bookpocket.TabManagerActivity) (context)).startSupportActionMode(new com.awchoudhary.bookpocket.NotesAdapter.ActionModeCallback());
    toggleSelection(position, noteViewHolder.cv);
    actionMode.setTitle(java.lang.Integer.toString(getSelectedItemCount()));
    return true;
}