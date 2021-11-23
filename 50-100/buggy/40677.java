@org.springframework.transaction.annotation.Transactional
public void update(final long landstingId, final java.util.List<se.inera.statistics.service.landsting.LandstingEnhetFileDataRow> newData) {
    java.util.List<se.inera.statistics.service.landsting.persistance.landstingenhet.LandstingEnhet> landstingEnhets = com.google.common.collect.Lists.transform(newData, new com.google.common.base.Function<se.inera.statistics.service.landsting.LandstingEnhetFileDataRow, se.inera.statistics.service.landsting.persistance.landstingenhet.LandstingEnhet>() {
        @java.lang.Override
        public se.inera.statistics.service.landsting.persistance.landstingenhet.LandstingEnhet apply(se.inera.statistics.service.landsting.LandstingEnhetFileDataRow data) {
            final se.inera.statistics.hsa.model.HsaIdEnhet enhetensHsaId = data.getEnhetensHsaId();
            return new se.inera.statistics.service.landsting.persistance.landstingenhet.LandstingEnhet(landstingId, enhetensHsaId, data.getListadePatienter());
        }
    });
    removeByLandstingId(landstingId);
    for (se.inera.statistics.service.landsting.persistance.landstingenhet.LandstingEnhet landstingEnhet : landstingEnhets) {
        manager.persist(landstingEnhet);
    }
}