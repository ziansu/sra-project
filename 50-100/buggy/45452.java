public java.lang.Integer getTileId(int id) {
    seventh.map.Tileset bestmatch = null;
    for (seventh.map.Tileset t : tilesets) {
        if (id >= (t.getStartId())) {
            if ((bestmatch == null) || ((bestmatch.getStartId()) < (t.getStartId()))) {
                bestmatch = t;
            }
        }
    }
    if (bestmatch != null) {
        return bestmatch.getTileId(id);
    }
    return null;
}