@java.lang.Override
public java.util.List<com.oneil.ranking.model.Ranks> retrieveTop10Ranks(java.util.Date recDate) {
    java.lang.String sql = "SELECT r FROM Ranks r where r.recDate=:recDate order by r.visits ";
    javax.persistence.Query query = entityManager.createQuery(sql);
    query.setParameter("recDate", recDate);
    query.setFirstResult(0);
    query.setMaxResults(10);
    java.util.List<com.oneil.ranking.model.Ranks> result = query.getResultList();
    com.oneil.ranking.repositories.RanksRepositoryImpl.logger.info(("retrieveTop10Ranks---------results---" + (result.size())));
    return result;
}