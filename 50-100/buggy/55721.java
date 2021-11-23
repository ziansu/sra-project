public edu.harvard.iq.dataverse.authorization.users.ApiToken findApiTokenByUser(edu.harvard.iq.dataverse.authorization.users.AuthenticatedUser au) {
    edu.harvard.iq.dataverse.authorization.users.ApiToken apiToken = null;
    javax.persistence.TypedQuery<edu.harvard.iq.dataverse.authorization.users.ApiToken> typedQuery = em.createQuery("SELECT OBJECT(o) FROM ApiToken AS o WHERE o.authenticatedUser = :user", edu.harvard.iq.dataverse.authorization.users.ApiToken.class);
    typedQuery.setParameter("user", au);
    try {
        apiToken = typedQuery.getSingleResult();
    } catch (javax.persistence.NoResultException | javax.persistence.NonUniqueResultException ex) {
        edu.harvard.iq.dataverse.authorization.AuthenticationServiceBean.logger.log(java.util.logging.Level.INFO, "When looking up API token for {0} caught {1}", new java.lang.Object[]{ au , ex });
    }
    return apiToken;
}