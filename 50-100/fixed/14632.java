@org.junit.Test
public void execute_listIsSorted() throws java.lang.Exception {
    seedu.address.logic.LogicManagerTest.TestDataHelper helper = new seedu.address.logic.LogicManagerTest.TestDataHelper();
    java.util.List<seedu.address.model.item.Item> expectedItems = helper.generateItemList(10);
    seedu.address.model.TaskBook expectedTB = helper.generateTaskBook(expectedItems);
    assertCommandBehavior("list", ListCommand.MESSAGE_SUCCESS, expectedTB, expectedItems);
}