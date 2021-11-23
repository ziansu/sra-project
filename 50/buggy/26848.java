@org.springframework.transaction.annotation.Transactional
public java.util.List<se.inera.statistics.service.landsting.persistance.landstingenhet.LandstingEnhet> getByLandstingId(long landstingId) {
    javax.persistence.TypedQuery<se.inera.statistics.service.landsting.persistance.landstingenhet.LandstingEnhet> query = manager.createQuery("SELECT l FROM LandstingEnhet l where l.landstingId = :landstingId", se.inera.statistics.service.landsting.persistance.landstingenhet.LandstingEnhet.class).setParameter("landstingId", landstingId);
    return query.getResultList();
}