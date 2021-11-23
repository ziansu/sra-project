@java.lang.Override
protected void hideSelection() {
    super.hideSelection();
    org.dbflute.erflute.editor.controller.editpart.element.connection.RelationEditPart editPart = ((org.dbflute.erflute.editor.controller.editpart.element.connection.RelationEditPart) (this.getHost()));
    editPart.refresh();
}