public static java.util.Collection<domain.Shift> getByRosterId(java.lang.String id) {
    dao.ShiftDAO.pm = jdo.PMF.get().getPersistenceManager();
    javax.jdo.Query q = dao.ShiftDAO.pm.newQuery(domain.Shift.class);
    q.setFilter("rosterId == idParam");
    q.declareParameters("String idParam");
    try {
        java.util.Collection<domain.Shift> res = ((java.util.Collection<domain.Shift>) (q.execute(id)));
        res.size();
        return res;
    } finally {
        q.closeAll();
        dao.ShiftDAO.pm.close();
    }
}