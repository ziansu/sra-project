@java.lang.Override
protected void configureShell(org.eclipse.swt.widgets.Shell newShell) {
    super.configureShell(newShell);
    newShell.setText((((EDIT_RELATIONSHIP_FEATURE_NAME) + " ") + (businessObject.getName())));
    newShell.setSize(WIDTH_EDIT_RELATIONSHIP_DIALOG, HEIGHT_EDIT_RELATIONSHIP_DIALOG);
}