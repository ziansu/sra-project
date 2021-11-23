@java.lang.Override
public void onItemCheckedStateChanged(android.view.ActionMode mode, int position, long id, boolean checked) {
    customImageSelectAdapter.toggleSelection(position, checked);
    mode.setTitle(((java.lang.String.valueOf(customImageSelectAdapter.getCountSelected())) + " selected"));
}