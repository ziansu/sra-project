public void handleError(java.lang.String dialogTitle, java.lang.String message, java.lang.String error) {
    org.corehunter.ui.ShellUtilitiies.logger.error("Error message: {}. Due to : {} ", message, error);
    if ((shell) != null) {
        org.eclipse.core.runtime.IStatus status;
        if (error != null) {
            status = org.corehunter.ui.ShellUtilitiies.createMultiStatus(message, error);
        }else {
            status = new org.eclipse.core.runtime.Status(org.eclipse.core.runtime.IStatus.ERROR, "org.corehunter.ui", message);
        }
        org.eclipse.jface.dialogs.ErrorDialog.openError(shell, dialogTitle, message, status);
    }
}