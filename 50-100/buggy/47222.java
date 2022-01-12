@java.lang.Override
public gov.healthit.chpl.auth.user.UserImpl getByName(java.lang.String uname) throws gov.healthit.chpl.auth.user.UserRetrievalException {
    gov.healthit.chpl.auth.user.UserImpl user = null;
    javax.persistence.Query query = entityManager.createQuery("from UserImpl where user_name = :uname", gov.healthit.chpl.auth.user.UserImpl.class);
    query.setParameter("uname", uname);
    java.util.List<gov.healthit.chpl.auth.user.UserImpl> result = query.getResultList();
    if ((result.size()) > 1) {
        throw new gov.healthit.chpl.auth.user.UserRetrievalException("Data error. Duplicate user name in database.");
    }
    if ((result.size()) < 0) {
        user = result.get(0);
    }
    return user;
}