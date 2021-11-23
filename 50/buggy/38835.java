public void setIncoming(java.util.List<org.dbflute.erflute.editor.model.diagram_contents.element.connection.WalkerConnection> relations) {
    this.incomings = relations;
    this.firePropertyChange(org.dbflute.erflute.editor.model.diagram_contents.element.node.DiagramWalker.PROPERTY_CHANGE_INCOMING, null, null);
}