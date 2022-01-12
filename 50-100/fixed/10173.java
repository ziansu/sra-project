private java.lang.String showEnterNameDialog() {
    javafx.scene.control.TextInputDialog dialog = new javafx.scene.control.TextInputDialog("walter");
    dialog.setTitle(this.res.enterNameDialogTitle);
    dialog.setHeaderText(this.res.enterNameDialogHeaderText);
    dialog.setContentText(this.res.enterNameDialogContentText);
    java.util.Optional<java.lang.String> result = dialog.showAndWait();
    if (result.isPresent()) {
        java.lang.System.out.println(("Your name: " + (result.get())));
        return result.get();
    }
    return null;
}