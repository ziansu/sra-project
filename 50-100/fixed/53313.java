public io.resourcepool.hvsz.persistance.models.Life getLife(java.lang.Integer id) {
    io.resourcepool.hvsz.persistance.models.Game g = dao.get(1L);
    int i = 0;
    for (io.resourcepool.hvsz.persistance.models.Life l : g.getStatus().getLives()) {
        if ((l.getId()) == id) {
            return g.getStatus().getLives().get(i);
        }
        i++;
    }
    return null;
}