@java.lang.Override
public void delete(T t) throws adnyre.exception.DaoException {
    this.entityManager.remove(this.entityManager.merge(t));
}