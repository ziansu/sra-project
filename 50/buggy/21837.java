@org.junit.Test
public void clearByCategory_existingCategory() {
    java.lang.String categoryDetails = "c/friends";
    seedu.taskboss.testutil.TestTask[] expectedTaskList = new seedu.taskboss.testutil.TestTask[]{ td.carl , td.daniel , td.elle , td.fiona , td.george };
    boolean isShortedCommand = false;
    assertClearSuccess(isShortedCommand, categoryDetails, expectedTaskList);
}