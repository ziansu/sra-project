@java.lang.Override
protected void createEditPolicies() {
    super.createEditPolicies();
    installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new com.vainolo.phd.opm.gef.editor.policy.OPMStateDirectEditPolicy());
    installEditPolicy("Snap Feedback", new org.eclipse.gef.editpolicies.SnapFeedbackPolicy());
}