private void configureMenuInternal(android.view.Menu menu, boolean foreignExchangeTransfer, boolean hasPlan) {
    menu.findItem(R.id.CREATE_INSTANCE_SAVE_COMMAND).setVisible(((!foreignExchangeTransfer) && (!hasPlan)));
    menu.findItem(R.id.CREATE_INSTANCE_EDIT_COMMAND).setVisible((!hasPlan));
}