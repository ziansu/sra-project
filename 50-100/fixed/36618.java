@java.lang.Override
public org.dbflute.erflute.editor.model.diagram_contents.element.node.DiagramWalker clone() {
    final org.dbflute.erflute.editor.model.diagram_contents.element.node.DiagramWalker clone = ((org.dbflute.erflute.editor.model.diagram_contents.element.node.DiagramWalker) (super.clone()));
    clone.location = location.clone();
    clone.setIncoming(new java.util.ArrayList<org.dbflute.erflute.editor.model.diagram_contents.element.connection.WalkerConnection>());
    clone.setOutgoing(new java.util.ArrayList<org.dbflute.erflute.editor.model.diagram_contents.element.connection.WalkerConnection>());
    return clone;
}