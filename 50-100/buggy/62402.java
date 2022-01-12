@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/{id:[0-9][0-9]*}")
@javax.ws.rs.Produces(value = "application/json")
public java.util.List<org.AgileKartRest.entity.AkUserAddress> listAll(@javax.ws.rs.PathParam(value = "id")
java.lang.Integer id, @javax.ws.rs.QueryParam(value = "start")
java.lang.Integer startPosition, @javax.ws.rs.QueryParam(value = "max")
java.lang.Integer maxResult) {
    javax.persistence.TypedQuery<org.AgileKartRest.entity.AkUserAddress> findAllQuery = em.createQuery("SELECT DISTINCT a FROM AkUserAddress a LEFT JOIN FETCH a.akUsers where a.akUsers.userId= :entityId ORDER BY a.addressId", org.AgileKartRest.entity.AkUserAddress.class);
    findAllQuery.setParameter("entityId", id);
    if (startPosition != null) {
        findAllQuery.setFirstResult(startPosition);
    }
    if (maxResult != null) {
        findAllQuery.setMaxResults(maxResult);
    }
    final java.util.List<org.AgileKartRest.entity.AkUserAddress> results = findAllQuery.getResultList();
    return results;
}