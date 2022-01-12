private void switchButtonStyle(javafx.scene.control.Button current) {
    if ((previous) != null) {
        previous.setStyle((("-fx-background-color: " + (magasin.user.LayoutControl.bright)) + "; -fx-border-color: #ffffff; -fx-border-width: 0 0 0 2;"));
    }
    if (current != null) {
        current.setStyle((("-fx-background-color: " + (magasin.user.LayoutControl.dark)) + "; -fx-border-color: #ffffff; -fx-border-width: 0 0 0 2;"));
    }
    previous = current;
}