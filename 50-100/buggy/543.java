public java.util.List<edu.harvard.lib.librarycloud.collections.dao.UserCollection> getUserCollectionsForUser(edu.harvard.lib.librarycloud.collections.dao.User u) {
    java.lang.String query = "select uc from UserCollection uc WHERE uc.user.id = :userId";
    java.util.List<edu.harvard.lib.librarycloud.collections.dao.UserCollection> result = em.createQuery(query, edu.harvard.lib.librarycloud.collections.dao.UserCollection.class).setParameter("userId", u.getId()).getResultList();
    return result;
}