public boolean mmousedown(haven.Coord mc, int button) {
    if (button != 1)
        return false;
    
    haven.Coord tc = mc.div(MCache.tilesz);
    if ((ol) != null)
        ol.destroy();
    
    ol = map.new haven.Overlay(tc, tc, (1 << 17));
    sc = tc;
    grab.mv = true;
    mgrab = ui.grabmouse(mv);
    return true;
}