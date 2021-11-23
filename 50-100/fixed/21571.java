public static domain.Shift getById(java.lang.String id) {
    dao.ShiftDAO.pm = jdo.PMF.get().getPersistenceManager();
    javax.jdo.Query q = dao.ShiftDAO.pm.newQuery(domain.Shift.class);
    q.setFilter("id == idParam");
    q.declareParameters("String idParam");
    try {
        java.util.List<domain.Shift> res = ((java.util.List<domain.Shift>) (q.execute(id)));
        return res.get(0);
    } finally {
        q.closeAll();
        dao.ShiftDAO.pm.close();
    }
}