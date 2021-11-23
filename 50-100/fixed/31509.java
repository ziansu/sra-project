public static void showErrorMessage(final java.lang.String title, final java.lang.String message, final java.lang.Throwable e) {
    final org.pentaho.di.ui.spoon.Spoon spoon = org.pentaho.di.profiling.datacleaner.ModelerHelper.getSpoon();
    spoon.getDisplay().syncExec(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            final org.eclipse.swt.widgets.Shell shell = spoon.getShell();
            new org.pentaho.di.ui.core.dialog.ErrorDialog(shell, title, message, e);
        }
    });
}