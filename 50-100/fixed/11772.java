@org.junit.Test
public void setPerformed() throws java.lang.Exception {
    int numOfFinishedTasks = repo.getDurationInfo(1).getNumOfFinishedTasks();
    org.junit.Assert.assertEquals("There should be no finished tasks, yet", 0, numOfFinishedTasks, 0);
    repo.setPerformed(1, 5);
    numOfFinishedTasks = repo.getDurationInfo(1).getNumOfFinishedTasks();
    org.junit.Assert.assertEquals("There should be 1 finished task now", 1, numOfFinishedTasks, 0);
}