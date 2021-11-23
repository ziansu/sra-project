@org.junit.Test
public void testEditJobDetails() {
    testLoginAsManager();
    inputHelper("2");
    next();
    inputHelper("2");
    next();
    inputHelper("1");
    next();
    inputHelper("1");
    next();
    inputHelper("newJobName");
    next();
    inputHelper("4");
    next();
    java.util.List<java.lang.String> jobs = ctrl.getCurrentUser().getMyJobNames();
    assertEquals(jobs.get(1), "newJobName");
}