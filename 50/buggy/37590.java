public void refreshRelations() {
    for (final java.lang.Object child : this.getChildren()) {
        if (child instanceof org.dbflute.erflute.editor.controller.editpart.element.node.DiagramWalkerEditPart) {
            final org.dbflute.erflute.editor.controller.editpart.element.node.DiagramWalkerEditPart part = ((org.dbflute.erflute.editor.controller.editpart.element.node.DiagramWalkerEditPart) (child));
            part.refreshConnections();
        }
    }
}