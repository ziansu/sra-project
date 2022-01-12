public void onInitializationComplete() {
    bindNonModuleExtensions(getExtensions());
    bindNonModuleExtensions(getExtensions());
    elementTree.expandRow(0);
    resetLayout();
    packFrame();
    requestFocus();
    javax.swing.JOptionPane.showMessageDialog(this, panels.XMLPanel.createTextArea("Initialization complete", false));
    requestFocus();
}