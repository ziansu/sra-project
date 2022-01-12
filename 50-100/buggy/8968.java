public void setNode(model.ClassNode person) {
    this.node = person;
    titleField.setText(node.getTitle());
    attributesArea.setText(node.attributesProperty().getValue());
    operationsArea.setText(node.operationsProperty().getValue());
}