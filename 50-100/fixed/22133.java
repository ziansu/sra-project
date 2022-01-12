public boolean isUserIcon(global.User u) {
    if ((u.getName().equals(nameField.getText())) && (u.getAddr().getHostAddress().equals(addressField.getText()))) {
        return true;
    }
    return false;
}