public static domain.Shift getById(java.lang.String id) {
    dao.ShiftDAO.pm = jdo.PMF.get().getPersistenceManager();
    javax.jdo.Query q = dao.ShiftDAO.pm.newQuery(domain.Shift.class);
    q.setFilter("id == idParam");
    q.declareParameters("String idParam");
    try {
        domain.Shift res = ((domain.Shift) (q.execute(id)));
        return res;
    } finally {
        q.closeAll();
        dao.ShiftDAO.pm.close();
    }
}