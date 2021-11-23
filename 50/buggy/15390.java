private static org.dockfx.ContentHolder checkDockPane(java.util.HashMap<java.lang.String, org.dockfx.ContentHolder> contents, org.dockfx.DockPane dockPane, java.lang.Integer count) {
    org.dockfx.pane.ContentPane pane = ((org.dockfx.pane.ContentPane) (dockPane.root));
    return org.dockfx.DockPane.checkPane(contents, pane, count);
}