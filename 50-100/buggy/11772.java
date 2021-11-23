@org.junit.Test
public void setPerformed() throws java.lang.Exception {
    int numOfFinishedTasks = repo.getDurationInfo(1).getNumOfFinishedTasks();
    org.junit.Assert.assertTrue("There should be no finished tasks, yet", (numOfFinishedTasks == 0));
    repo.setPerformed(1, 5);
    numOfFinishedTasks = repo.getDurationInfo(1).getNumOfFinishedTasks();
    org.junit.Assert.assertTrue("There should be 1 finished task now", (numOfFinishedTasks == 1));
}