@org.junit.Test
public void testGetNextScorePassable() {
    int travelDirection = 0;
    double expResult = 100.0 / (distToGoal(kbs_rover_project.InferenceEngineTest.wtPassable));
    double result = kbs_rover_project.InferenceEngineTest.testEngine.getNextScore(kbs_rover_project.InferenceEngineTest.wtPassable);
    assertEquals(expResult, result, 0.0);
    kbs_rover_project.InferenceEngineTest.testEngine.addPathScore(kbs_rover_project.InferenceEngineTest.wtPassable);
    expResult *= 0.5;
    result = kbs_rover_project.InferenceEngineTest.testEngine.getNextScore(kbs_rover_project.InferenceEngineTest.wtPassable);
    assertEquals(expResult, result, 0.0);
}