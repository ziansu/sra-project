public static com.tri.pgs.client.surface.ui.UIObjectContextMenu createObjectContextMenu(com.tri.pgs.client.surface.Surface surface) {
    com.tri.pgs.client.surface.ui.UIObjectContextMenu comp = new com.tri.pgs.client.surface.ui.UIObjectContextMenu(surface);
    com.tri.pgs.client.surface.ui.UISystem.init(comp, true);
    return comp;
}