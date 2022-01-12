@org.junit.Test
public void shouldFetchEncounterTransactionByUuid() throws java.lang.Exception {
    org.openmrs.Encounter encounter = new org.openmrs.module.emrapi.encounter.builder.EncounterBuilder().build();
    org.mockito.Mockito.when(encounterService.getEncounterByUuid("encounterUuid")).thenReturn(encounter);
    org.mockito.Mockito.when(encounterTransactionMapper.map(encounter, false)).thenReturn(new org.openmrs.module.emrapi.encounter.domain.EncounterTransaction());
    org.openmrs.module.emrapi.encounter.domain.EncounterTransaction encounterTransaction = emrEncounterService.getEncounterTransaction("encounterUuid", false);
    org.mockito.Mockito.verify(encounterTransactionMapper).map(encounter, false);
    org.junit.Assert.assertNotNull(encounterTransaction);
}