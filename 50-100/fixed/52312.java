@java.lang.Override
public void run() {
    try {
        job.print();
    } catch (java.awt.print.PrinterException ex) {
        mDialog.hide();
        javax.swing.JOptionPane.showInternalMessageDialog(this, ex, "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    } finally {
        mDialog.hide();
    }
}