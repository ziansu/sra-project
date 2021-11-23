public boolean containsUser(java.lang.String username) {
    for (int i = 0; i < (MODEL.getSize()); i++) {
        if (MODEL.getElementAt(i).toString().contains(username)) {
            return true;
        }
    }
    return false;
}