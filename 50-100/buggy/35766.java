@org.junit.Before
public void init() {
    store = com.b2international.index.Indexes.createIndex(java.util.UUID.randomUUID().toString(), new com.fasterxml.jackson.databind.ObjectMapper(), new com.b2international.index.mapping.Mappings(com.b2international.snowowl.snomed.datastore.id.domain.SctId.class));
    store.admin().create();
    final com.google.inject.Provider<com.b2international.index.Index> storeProvider = com.google.inject.util.Providers.of(store);
    final com.b2international.snowowl.snomed.datastore.id.reservations.ISnomedIdentiferReservationService reservationService = new com.b2international.snowowl.snomed.datastore.internal.id.reservations.SnomedIdentifierReservationServiceImpl();
    final com.b2international.snowowl.snomed.datastore.id.gen.ItemIdGenerationStrategy idGenerationStrategy = new com.b2international.snowowl.snomed.datastore.id.gen.SequentialItemIdGenerationStrategy(storeProvider, reservationService);
    service = new com.b2international.snowowl.snomed.datastore.id.memory.DefaultSnomedIdentifierService(storeProvider, idGenerationStrategy, reservationService, new com.b2international.snowowl.snomed.datastore.config.SnomedIdentifierConfiguration());
}