public static java.util.Collection<domain.Shift> getAll() {
    dao.ShiftDAO.pm = jdo.PMF.get().getPersistenceManager();
    javax.jdo.Query q = dao.ShiftDAO.pm.newQuery(domain.Availability.class);
    try {
        java.util.Collection<domain.Shift> res = ((java.util.Collection<domain.Shift>) (q.execute()));
        res.size();
        return res;
    } finally {
        q.closeAll();
        dao.ShiftDAO.pm.close();
    }
}