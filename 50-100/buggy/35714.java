private void startBActionPerformed(java.awt.event.ActionEvent evt) {
    org.cytoscape.model.CyNetwork network = getSelectedNetwork();
    org.cytoscape.view.model.CyNetworkView networkview;
    if (network != null) {
        networkview = pewccapp.getApplicationManager().getCurrentNetworkView();
        pewccapp.runAlgorithm(network, networkview, 3, joinPValueValidate(joinPValue));
    }else {
        startB.setEnabled(false);
        javax.swing.JOptionPane.showMessageDialog(null, "IMPORT a network first! ", "No Network found ", javax.swing.JOptionPane.WARNING_MESSAGE);
    }
}