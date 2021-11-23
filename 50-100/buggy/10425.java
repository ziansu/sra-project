public void uninstallClientDecorations(javax.swing.JRootPane root) {
    uninstallBorder(root);
    uninstallWindowListeners(root);
    setTitlePane(root, null);
    uninstallLayout(root);
    int style = com.jtattoo.plaf.DecorationHelper.getWindowDecorationStyle(root);
    if (style == (com.jtattoo.plaf.BaseRootPaneUI.NONE)) {
        root.repaint();
        root.revalidate();
    }
    if ((window) != null) {
        window.setCursor(savedCursor);
    }
    window = null;
}