protected void okPressed() {
    try {
        if (!(com.groupproject.workbench.JavaModelHelper.newPackage(packageNameValue.getText()))) {
            org.eclipse.jface.dialogs.MessageDialog.openError(container.getShell(), "Error", "Package name should not contain '.package'");
            return ;
        }
    } catch (java.lang.Exception e) {
        org.eclipse.jface.dialogs.MessageDialog.openError(container.getShell(), "Error", "Package name should not contain '.package'");
    }
    super.okPressed();
}