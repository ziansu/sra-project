@java.lang.Override
public boolean update(int id, models.User item) {
    session.beginTransaction();
    org.hibernate.Query query = session.createQuery(HQL_UPDATE_USER);
    query.setParameter("name", item.getName()).setParameter("age", item.getAge()).setParameter("id", id);
    int result = query.executeUpdate();
    session.getTransaction().commit();
    return result > 0;
}