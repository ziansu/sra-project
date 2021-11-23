public void setSourceWalker(org.dbflute.erflute.editor.model.diagram_contents.element.node.DiagramWalker sourceWalker) {
    if (sourceWalker != null) {
        sourceWalker.removeOutgoing(this);
    }
    this.sourceWalker = sourceWalker;
    if (sourceWalker != null) {
        sourceWalker.addOutgoing(this);
    }
    firePropertyChange(org.dbflute.erflute.editor.model.diagram_contents.element.connection.WalkerConnection.PROPERTY_CHANGE_CONNECTION, null, sourceWalker);
}