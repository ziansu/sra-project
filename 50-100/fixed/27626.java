@org.junit.Test
public void getAverageDuration() throws java.lang.Exception {
    com.ptc.taskanalyse.services.TaskService service = new com.ptc.taskanalyse.services.TaskService(repo);
    repo.setPerformedWithAvgDuration(2, 5, 5);
    repo.setPerformedWithAvgDuration(1, 10, 10);
    org.junit.Assert.assertEquals("Avg duration should be the initial 5", 5, repo.getAverageDuration(2), 0);
    repo.setPerformedWithAvgDuration(2, 9, service.recalculateAverageDuration(2, 9));
    org.junit.Assert.assertEquals("Avg duration should be 7 now", 7, repo.getAverageDuration(2), 0);
}