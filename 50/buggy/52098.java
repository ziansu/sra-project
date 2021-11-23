public void addOutgoing(org.dbflute.erflute.editor.model.diagram_contents.element.connection.WalkerConnection relation) {
    this.outgoings.add(relation);
    this.firePropertyChange(org.dbflute.erflute.editor.model.diagram_contents.element.node.DiagramWalker.PROPERTY_CHANGE_OUTGOING, null, null);
}