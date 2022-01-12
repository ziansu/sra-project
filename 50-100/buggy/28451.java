private void changeMail() {
    try {
        if (((selectedContact) == null) || ((mailField.getText()) == null)) {
            return ;
        }
        java.lang.String text = mailField.getText();
        selectedContact.setEmail(text);
        mailErrorIco.setVisible(false);
        saved = false;
    } catch (java.lang.IllegalArgumentException iae) {
        mailErrorIco.setVisible(true);
    }
    listview.refresh();
}