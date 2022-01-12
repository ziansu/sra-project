@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        javax.swing.JDialog dialog = new com.net2plan.gui.utils.viewEditTopolTables.specificTables.AttributeEditor(networkViewer, networkElementType);
        dialog.setVisible(true);
        networkViewer.updateNetPlanView();
        restoreColumnsPositions();
    } catch (java.lang.Throwable ex) {
        ex.printStackTrace();
        com.net2plan.internal.ErrorHandling.showErrorDialog(ex.getMessage(), "Error modifying attributes");
    }
}