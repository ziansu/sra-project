@org.junit.Test
public void getUserIdsForActor_throws_RetrieveException_when_actorMappingService_throws_SBonitaException() throws java.lang.Exception {
    final org.bonitasoft.engine.actor.mapping.model.SActor actor = mock(org.bonitasoft.engine.actor.mapping.model.SActor.class);
    when(actor.getId()).thenReturn(org.bonitasoft.engine.api.impl.ProcessAPIImplTest.ACTOR_ID);
    when(actorMappingService.getActor(org.bonitasoft.engine.api.impl.ProcessAPIImplTest.ACTOR_NAME, org.bonitasoft.engine.api.impl.ProcessAPIImplTest.PROCESS_DEFINITION_ID)).thenThrow(new org.bonitasoft.engine.actor.mapping.SActorNotFoundException(""));
    try {
        processAPI.getUserIdsForActor(org.bonitasoft.engine.api.impl.ProcessAPIImplTest.PROCESS_DEFINITION_ID, org.bonitasoft.engine.api.impl.ProcessAPIImplTest.ACTOR_NAME, 0, 10);
        fail("Exception expected");
    } catch (final org.bonitasoft.engine.exception.RetrieveException e) {
    }
}