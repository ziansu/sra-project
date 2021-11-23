public static java.util.Collection<domain.Availability> getByEmail(java.lang.String email) {
    dao.AvailabilityDAO.pm = jdo.PMF.get().getPersistenceManager();
    javax.jdo.Query q = dao.AvailabilityDAO.pm.newQuery(domain.Availability.class);
    q.setFilter("email == emailParam");
    q.declareParameters("String emailParam");
    try {
        java.util.Collection<domain.Availability> res = ((java.util.Collection<domain.Availability>) (q.execute(email)));
        res.size();
        return res;
    } finally {
        q.closeAll();
        dao.AvailabilityDAO.pm.close();
    }
}