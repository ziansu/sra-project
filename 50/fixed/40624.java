@org.junit.Test
public void testGetNextScoreBlocking() {
    int travelDirection = 0;
    double expResult = 0.0 / (distToGoal(kbs_rover_project.InferenceEngineTest.wtBlocking));
    double result = kbs_rover_project.InferenceEngineTest.testEngine.getNextScore(kbs_rover_project.InferenceEngineTest.wtBlocking);
    assertEquals(expResult, result, 0.0);
}