private void removeSelectedContact() {
    if ((listview.getFocusModel().getFocusedItem()) == null) {
        return ;
    }else {
        contacts.remove(((model.Contact) (listview.getSelectionModel().getSelectedItem())));
        selectedContact = null;
        emptyFields();
        saved = false;
    }
    listview.refresh();
}