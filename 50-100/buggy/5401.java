public void focuspanel() {
    if ((lastselectedPanel) != null) {
        lastselectedPanel.setBackground(originColor);
    }
    if ((selectedPanel) != null) {
        originColor = selectedPanel.getBackground();
        selectedPanel.setBackground(java.awt.Color.GRAY);
    }
    _editPans[_tab.getSelectedIndex()].setComponentZOrder(selectedPanel, 0);
}