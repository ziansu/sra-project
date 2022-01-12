public void setNode(model.ClassNode node) {
    this.node = node;
    titleField.setText(this.node.getTitle());
    attributesArea.setText(this.node.attributesProperty().getValue());
    operationsArea.setText(this.node.operationsProperty().getValue());
}