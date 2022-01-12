public java.lang.Integer getLastId(java.lang.Long id) {
    io.resourcepool.hvsz.persistance.models.Game g = dao.get(id);
    int maxId = 0;
    if ((g.getStatus().getLives()) == null) {
        return maxId;
    }
    for (io.resourcepool.hvsz.persistance.models.Life l : g.getStatus().getLives()) {
        if ((l.getId()) > maxId) {
            maxId = l.getId();
        }
    }
    return maxId;
}