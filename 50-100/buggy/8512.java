public javafx.scene.control.Button toButton() {
    javafx.scene.control.Button button = new javafx.scene.control.Button(this.label);
    button.setGraphic(((this.graphic) != null ? this.graphic.get() : null));
    button.setUserData(this);
    return button;
}