public void testQueryByDuedateHigherThan() {
    org.activiti.engine.runtime.JobQuery query = managementService.createJobQuery().duedateHigherThan(testStartTime);
    verifyQueryResults(query, 4);
    query = managementService.createJobQuery().duedateHigherThan(timerOneFireTime);
    verifyQueryResults(query, 3);
    query = managementService.createJobQuery().duedateHigherThan(timerTwoFireTime);
    verifyQueryResults(query, 1);
    query = managementService.createJobQuery().duedateHigherThan(timerThreeFireTime);
    verifyQueryResults(query, 0);
}