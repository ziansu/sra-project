@java.lang.Override
public void saveOrUpdate(T entity) {
    try {
        com.ccloomi.core.common.dao.GenericDao.update(entity);
    } catch (java.lang.Exception e) {
        save(entity);
    }
}