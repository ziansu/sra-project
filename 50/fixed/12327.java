@java.lang.Override
public void displayPanelResized(edu.njit.cs.saboc.blu.core.gui.gep.AbNDisplayPanel displayPanel) {
    this.setBounds(10, (((displayPanel.getBounds().height) - (panelSize.height)) - 10), panelSize.width, panelSize.height);
    this.validate();
}