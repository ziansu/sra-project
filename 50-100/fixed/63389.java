public void updatePane() {
    int index = gui.GUIPane.tabbedPane.getSelectedIndex();
    if (index != (-1)) {
        gui.GraphTab graphTab = graphTabs.get(index);
        graphTab.updateImage();
        gui.GUIPane.tabbedPane.setComponentAt(index, graphTab.getpanel());
        gui.GUIPane.tabbedPane.repaint();
    }
}