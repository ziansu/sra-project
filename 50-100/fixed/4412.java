public javafx.scene.control.MenuItem toMenuItem(java.lang.String label) {
    javafx.scene.control.MenuItem item = new javafx.scene.control.MenuItem(label);
    item.setGraphic(((this.graphic) != null ? this.graphic.get() : null));
    item.setAccelerator(this.accelerator);
    item.setUserData(this);
    return item;
}