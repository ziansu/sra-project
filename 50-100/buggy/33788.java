@java.lang.Override
public int getCountData(int category) {
    org.hibernate.Session session = this.getSessionFactory().getCurrentSession();
    java.lang.String hql = "select count(*) from ChineseCharacter where category=:category";
    if (category == 0) {
        hql = "select count(*) from ChineseCharacter ";
    }
    org.hibernate.Query query = session.createQuery(hql);
    if (category == 0) {
        query.setParameter("category", category);
    }
    return ((java.lang.Number) (query.uniqueResult())).intValue();
}