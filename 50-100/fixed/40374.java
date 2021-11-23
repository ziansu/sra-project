public static boolean showConfirmDialog() {
    boolean result = false;
    if (!(org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.thread.UIDialog.standaloneMode)) {
        org.eclipse.swt.widgets.Shell shell = org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.thread.UIDialog.getCurrentShell();
        result = org.eclipse.jface.dialogs.MessageDialog.openConfirm(shell, "Confirm", "Please confirm the action");
    }else {
        result = false;
    }
    return result;
}