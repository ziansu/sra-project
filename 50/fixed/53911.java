private void initTextFields() {
    javafx.scene.layout.VBox content = getTextfieldBox();
    initNameDescriptionFields(content);
    initCountTextfields(content);
    this.centerPane.getChildren().add(content);
}