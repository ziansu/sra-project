@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent __) {
    (numTopPorts)--;
    blackBoxView.portDeleted(portView);
    topPortsPanel.remove(portPanel);
    validate();
    modalAncestor.pack();
    modalAncestor.setLocationRelativeTo(null);
}