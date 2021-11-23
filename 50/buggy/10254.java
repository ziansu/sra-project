private boolean jj_3R_35() {
    if (jj_scan_token(org.openstreetmap.josm.gui.mappaint.mapcss.parser.IDENT))
        return true;
    
    org.openstreetmap.josm.gui.mappaint.mapcss.parser.Token xsp;
    while (true) {
        xsp = jj_scanpos;
        if (jj_3R_55()) {
            jj_scanpos = xsp;
            break;
        }
    } 
    return false;
}