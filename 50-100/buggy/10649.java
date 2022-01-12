private void createPanel() {
    final javax.swing.JPanel textPanel = createTextPanel("Instructions", getInstructions());
    this.add(textPanel, java.awt.BorderLayout.NORTH);
    productSetPanel = new org.esa.snap.graphbuilder.rcp.dialogs.ProductSetPanel(org.esa.snap.rcp.SnapApp.getDefault().getAppContext(), null, new org.esa.snap.graphbuilder.rcp.dialogs.support.FileTable(), false, true);
    this.add(productSetPanel, java.awt.BorderLayout.CENTER);
}