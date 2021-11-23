@java.lang.Override
public void run() {
    if (showErrorMessages) {
        java.io.StringWriter errors = new java.io.StringWriter();
        except.printStackTrace(new java.io.PrintWriter(errors));
        dialog.setErrorMessage(errors.toString());
        dialog.setLocationRelativeTo(null);
        dialog.setModal(true);
        dialog.setVisible(true);
    }
}