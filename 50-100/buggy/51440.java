@java.lang.Override
public void updateProductionScore(int productionId, float averageScore, int round) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    java.lang.String hql = "update Production set score = ?, round = ? where id = ? ";
    org.hibernate.Query query = session.createQuery(hql);
    query.setParameter(0, averageScore);
    query.setParameter(1, round);
    query.setParameter(2, productionId);
    query.executeUpdate();
}