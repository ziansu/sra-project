private void changeNumber() {
    if (((selectedContact) != null) && ((numberField.getText()) != null)) {
        try {
            selectedContact.setNumber(numberField.getText());
            numberErrorIco.setVisible(false);
            saved = false;
        } catch (java.lang.NumberFormatException ex) {
            numberErrorIco.setVisible(true);
        }
        listview.refresh();
    }
}