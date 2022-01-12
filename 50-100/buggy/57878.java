@cucumber.api.java.en.Then(value = "^(.*?) should be deleted$")
public void taskDeletedVerification(java.lang.String taskName) throws java.lang.Throwable {
    log.info("Step", (taskName + " should be deleted"), "Verifying deleted task");
    storyPage.clickOnCreateStory();
    storyPage.clickOnExpandStory();
    org.testng.Assert.assertEquals(0, taskPage.sizeContentNameTask(taskName));
}