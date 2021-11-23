private void changeMail() {
    if (((selectedContact) != null) && ((mailField.getText()) != null)) {
        try {
            java.lang.String text = mailField.getText();
            selectedContact.setEmail(text);
            mailErrorIco.setVisible(false);
            saved = false;
        } catch (java.lang.IllegalArgumentException iae) {
            mailErrorIco.setVisible(true);
        }
        listview.refresh();
    }
}