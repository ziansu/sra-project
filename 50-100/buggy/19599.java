public net.imagej.ui.swing.script.TextEditorTab getTab() {
    final int index = tabbed.getSelectedIndex();
    if (index < 0) {
        if ((tabbed.getTabCount()) == 0) {
            createNewDocument();
        }
        tabbed.setSelectedIndex(0);
    }
    return ((net.imagej.ui.swing.script.TextEditorTab) (tabbed.getComponentAt(index)));
}