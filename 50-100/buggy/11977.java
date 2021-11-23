@java.lang.Override
public void run() {
    if (showErrorMessages) {
        java.io.StringWriter errors = new java.io.StringWriter();
        e.printStackTrace(new java.io.PrintWriter(errors));
        dialog.setErrorMessage(((errors.toString()) + "</p></html>"));
        dialog.setLocationRelativeTo(null);
        dialog.setModal(true);
        dialog.setVisible(true);
    }
}