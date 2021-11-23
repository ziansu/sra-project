public void show() {
    identityEdit.setVisible(true);
    if (!(layoutWindow.getChildren().contains(identityEdit))) {
        layoutWindow.getChildren().add(identityEdit);
    }
}