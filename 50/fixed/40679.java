@java.lang.Override
public T read(PK id) {
    javax.persistence.EntityManager entityManager = com.fpt.router.artifacter.dao.common.JPADaoImpl.factory.createEntityManager();
    T t = entityManager.find(entityClass, id);
    return t;
}