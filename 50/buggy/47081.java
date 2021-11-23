public void setLocation(org.dbflute.erflute.editor.model.diagram_contents.element.node.Location location) {
    this.location = location;
    this.firePropertyChange(org.dbflute.erflute.editor.model.diagram_contents.element.node.DiagramWalker.PROPERTY_CHANGE_RECTANGLE, null, null);
}