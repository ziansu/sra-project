@org.junit.Test
public void testMyJobs() {
    testLoginAsStaff();
    currentState = State.MY_JOBS;
    next();
    assertEquals(currentState, State.SUCCESS_MSG);
    testLoginAsManager();
    currentState = State.MY_JOBS;
    inputHelper("1");
    next();
    assertEquals(currentState, State.VIEW_JOB);
    currentState = State.MY_JOBS;
    inputHelper("5");
    next();
    assertEquals(currentState, State.MAIN);
}