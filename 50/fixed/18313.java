@org.junit.Before
public void setUp() {
    movementModel = new dmas.model.CollisionAvoidanceModel.Builder().withRoadModel(roadModel).withCollisionRadius(dmas.model.CollisionAvoidanceModelTest.COLLISION_RADIUS).build();
}