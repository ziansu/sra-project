@java.lang.Override
public T find(long id) {
    return em.find(entityClass, id);
}