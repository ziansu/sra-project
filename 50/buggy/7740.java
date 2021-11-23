@java.lang.Override
protected void createEditPolicies() {
    this.installEditPolicy(EditPolicy.CONNECTION_ROLE, new org.dbflute.erflute.editor.controller.editpolicy.element.connection.RelationEditPolicy());
}