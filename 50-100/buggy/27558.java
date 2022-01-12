private ebiNeutrinoSDK.gui.component.EBIVisualPanelTemplate getJContentPane() {
    if ((jContentPane) == null) {
        jContentPane = new ebiNeutrinoSDK.gui.component.EBIVisualPanelTemplate(false);
        jContentPane.setClosable(true);
        jContentPane.setEnableChangeComponent(false);
        jContentPane.getPanel().setLayout(new java.awt.BorderLayout());
        jContentPane.setModuleIcon(EBIConstant.ICON_APP);
        jContentPane.setModuleTitle("EBI Database setup");
        jContentPane.add(getJTabbedPane(), null);
        jContentPane.updateUI();
    }
    return jContentPane;
}