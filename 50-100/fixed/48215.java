protected boolean handleDeletion(javafx.scene.input.KeyEvent e) {
    if (isActive()) {
        if ((e.getCode()) == (javafx.scene.input.KeyCode.DELETE)) {
            parent.deactivateSearch();
            return true;
        }
        handleKey(e);
        searchResult(e);
    }
    return false;
}