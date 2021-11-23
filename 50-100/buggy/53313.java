public io.resourcepool.hvsz.persistance.models.Life getLife(java.lang.Integer id) {
    io.resourcepool.hvsz.persistance.models.Game g = dao.get(1L);
    for (io.resourcepool.hvsz.persistance.models.Life l : g.getStatus().getLives()) {
        if ((l.getId()) == id) {
            return l;
        }
    }
    return null;
}