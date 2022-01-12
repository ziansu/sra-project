private void deleteReport(io.github.davidg95.JTill.jtillserver.TillReport report) {
    if ((javax.swing.JOptionPane.showInternalConfirmDialog(this, "Are you sure you want to remove this report?", "Remove Report", javax.swing.JOptionPane.YES_NO_OPTION)) == (javax.swing.JOptionPane.YES_NO_OPTION)) {
        try {
            dc.removeDeclarationReport(report.getId());
            update();
        } catch (java.io.IOException | java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex, "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
}