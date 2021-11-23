public T update(T entity) {
    try {
        org.hibernate.Session session = sessionFactory.getCurrentSession();
        session.update(entity);
        return entity;
    } catch (java.lang.Exception e) {
        com.javakit.data.log.Log.error("更新失败", e);
        return null;
    }
}