public void onInitializationComplete() {
    bindNonModuleExtensions(getExtensions());
    bindNonModuleExtensions(getExtensions());
    elementTree.expandRow(0);
    resetLayout();
    packFrame();
    javax.swing.JOptionPane.showMessageDialog(this, panels.XMLPanel.createTextArea("Initialization complete", false));
    requestFocus();
}