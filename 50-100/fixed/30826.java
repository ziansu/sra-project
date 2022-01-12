private void initAdapter() {
    super.dialogsAdapter = new com.stfalcon.chatkit.dialogs.DialogsListAdapter(super.imageLoader);
    super.dialogsAdapter.setItems(tGrupos);
    super.dialogsAdapter.setOnDialogClickListener(this);
    super.dialogsAdapter.setOnDialogLongClickListener(this);
    dialogsList.setAdapter(super.dialogsAdapter);
    dialogsList.scrollToPosition(((tGrupos.size()) - 1));
}