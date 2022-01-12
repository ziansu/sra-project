public javafx.scene.control.Button toButton(java.lang.String label) {
    javafx.scene.control.Button button = new javafx.scene.control.Button(label);
    button.setGraphic(((this.graphic) != null ? this.graphic.get() : null));
    button.setUserData(this);
    return button;
}