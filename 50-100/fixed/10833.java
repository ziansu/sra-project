@org.junit.Test
public void getDurationInfo() throws java.lang.Exception {
    com.ptc.taskanalyse.services.TaskService service = new com.ptc.taskanalyse.services.TaskService(repo);
    repo.setPerformed(2, 5);
    repo.setPerformed(1, 5);
    com.ptc.taskanalyse.models.TaskDurationInfo durInfo = repo.getDurationInfo(2);
    org.junit.Assert.assertEquals("There should be 1 finished task", 1, durInfo.getNumOfFinishedTasks());
}