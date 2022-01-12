@org.springframework.transaction.annotation.Transactional
public void removeByLandstingId(java.lang.Long landstingId) {
    final java.util.List<se.inera.statistics.service.landsting.persistance.landstingenhet.LandstingEnhet> landstingEnhets = getByLandstingId(landstingId);
    for (se.inera.statistics.service.landsting.persistance.landstingenhet.LandstingEnhet landstingEnhet : landstingEnhets) {
        manager.remove(landstingEnhet);
    }
}