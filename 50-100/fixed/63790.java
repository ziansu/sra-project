private void removeSelectedContact() {
    if ((selectedContact) != null) {
        contacts.remove(((model.Contact) (listview.getSelectionModel().getSelectedItem())));
        selectedContact = null;
        emptyFields();
        saved = false;
        listview.refresh();
    }
}