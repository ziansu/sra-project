@org.junit.Test
public void moveTo_noColliders() throws java.lang.Exception {
    when(roadModel.getObjects()).thenReturn(com.google.common.collect.ImmutableSet.of());
    movementModel.moveTo(dmas.model.CollisionAvoidanceModelTest.A_MOVING_ROAD_USER, dmas.model.CollisionAvoidanceModelTest.A_DESTINATION, null);
    verify(roadModel).moveTo(dmas.model.CollisionAvoidanceModelTest.A_MOVING_ROAD_USER, dmas.model.CollisionAvoidanceModelTest.A_DESTINATION, null);
}