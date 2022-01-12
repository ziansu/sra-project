public T create(T entity) {
    try {
        org.hibernate.Session session = sessionFactory.getCurrentSession();
        session.save(entity);
        return entity;
    } catch (java.lang.Exception e) {
        com.javakit.data.log.Log.error("创建失败", e);
        return null;
    }
}