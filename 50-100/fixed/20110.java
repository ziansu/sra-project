public void installClientDecorations(javax.swing.JRootPane root) {
    installBorder(root);
    if ((titlePane) == null) {
        setTitlePane(root, createTitlePane(root));
    }
    installWindowListeners(root, root.getParent());
    installLayout(root);
    if ((window) != null) {
        root.revalidate();
        root.repaint();
    }
}