public void run() {
    try {
        btnPrint.setEnabled(false);
        this.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.WAIT_CURSOR));
        net.sf.jasperreports.engine.JasperPrintManager.printReport(jasperPrint, true);
    } catch (java.lang.Exception ex) {
        if (com.openbravo.pos.util.JRViewer411.log.isErrorEnabled()) {
            com.openbravo.pos.util.JRViewer411.log.error("Print error.", ex);
        }
        javax.swing.JOptionPane.showMessageDialog(this, getBundleString("error.printing"));
    } finally {
        this.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPrint.setEnabled(true);
    }
}