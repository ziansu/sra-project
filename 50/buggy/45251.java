private boolean newNodeNameComesLater(java.lang.String newName) {
    if ((name.compareToIgnoreCase(newName)) < 0) {
        return true;
    }
    return false;
}