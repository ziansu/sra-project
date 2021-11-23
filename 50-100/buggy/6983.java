private boolean better(java.util.Set<de.htw.fb4.imi.master.ws15_16.foellmer_feldmann.ip.Vector2D> newPolygon, java.util.Set<de.htw.fb4.imi.master.ws15_16.foellmer_feldmann.ip.Vector2D> bestPolygon) {
    return ((bestPolygon.size()) == 0) || (((newPolygon.size()) < (bestPolygon.size())) && ((newPolygon.size()) != 0));
}