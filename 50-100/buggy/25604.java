public boolean mmouseup(haven.Coord mc, int button) {
    if ((sc) != null) {
        haven.Coord ec = mc.div(haven.MCache.tilesz);
        xl.mv = false;
        tt = null;
        ol.destroy();
        mgrab.remove();
        wdgmsg("sel", sc, ec, modflags);
        sc = null;
    }
    return true;
}