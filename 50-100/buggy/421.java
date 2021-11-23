@java.lang.Override
public <T extends org.sjr.babel.entity.AbstractEntity> java.lang.Long count(java.lang.Class<T> clazz, java.lang.String hql, java.util.Map<java.lang.String, java.lang.Object> args) {
    javax.persistence.TypedQuery<java.lang.Long> query = em.createQuery(hql, java.lang.Long.class).setFirstResult(0).setMaxResults(1);
    args.forEach(query::setParameter);
    return query.getSingleResult();
}