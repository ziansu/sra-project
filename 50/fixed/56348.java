public edu.harvard.lib.librarycloud.collections.dao.Collection getCollection(java.lang.Integer id) {
    edu.harvard.lib.librarycloud.collections.dao.Collection result;
    try {
        result = em.find(edu.harvard.lib.librarycloud.collections.dao.Collection.class, id);
    } catch (edu.harvard.lib.librarycloud.collections.dao.NoResultException e) {
        return null;
    }
    return result;
}