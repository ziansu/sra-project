public java.util.List<org.dbflute.erflute.editor.model.diagram_contents.element.node.DiagramWalker> getReferringElementList() {
    final java.util.List<org.dbflute.erflute.editor.model.diagram_contents.element.node.DiagramWalker> referringElementList = new java.util.ArrayList<org.dbflute.erflute.editor.model.diagram_contents.element.node.DiagramWalker>();
    for (final org.dbflute.erflute.editor.model.diagram_contents.element.connection.WalkerConnection connectionElement : this.getOutgoings()) {
        final org.dbflute.erflute.editor.model.diagram_contents.element.node.DiagramWalker targetElement = connectionElement.getWalkerTarget();
        referringElementList.add(targetElement);
    }
    return referringElementList;
}