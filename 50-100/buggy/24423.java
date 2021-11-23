private void changeNumber() {
    try {
        if (((selectedContact) == null) || ((numberField.getText()) == null)) {
            return ;
        }
        selectedContact.setNumber(numberField.getText());
        numberErrorIco.setVisible(false);
        saved = false;
    } catch (java.lang.NumberFormatException ex) {
        numberErrorIco.setVisible(true);
    }
    listview.refresh();
}