@java.lang.Override
public void delete(T t) throws adnyre.exception.DaoException {
    t = this.entityManager.merge(t);
    this.entityManager.remove(t);
}