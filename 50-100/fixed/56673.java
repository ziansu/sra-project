@java.lang.Override
public void run() {
    org.eclipse.swt.widgets.Shell shell = org.eclipse.ui.PlatformUI.getWorkbench().getDisplay().getActiveShell();
    if (shell == null) {
        return ;
    }
    if (noDialogVisible()) {
        createAndOpenDialog(shell, headline, message, details, severity, throwable);
    }else {
        addExceptionToDialog(throwable);
    }
}