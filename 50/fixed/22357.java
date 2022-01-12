@java.lang.Override
protected void hideSelection() {
    super.hideSelection();
    final org.dbflute.erflute.editor.controller.editpart.element.connection.RelationEditPart editPart = ((org.dbflute.erflute.editor.controller.editpart.element.connection.RelationEditPart) (getHost()));
    editPart.refresh();
}