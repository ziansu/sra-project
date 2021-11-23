@org.junit.Test
public void execute_list_showsAllEntrys() throws java.lang.Exception {
    seedu.address.logic.LogicManagerTest.TestDataHelper helper = new seedu.address.logic.LogicManagerTest.TestDataHelper();
    seedu.address.model.Scheduler expectedAB = helper.generateScheduler(2);
    java.util.List<? extends seedu.address.logic.ReadOnlyEntry> expectedList = expectedAB.getEntryList();
    helper.addToModel(model, 2);
    assertCommandBehavior("list", ListCommand.MESSAGE_SUCCESS, expectedAB, expectedList);
}