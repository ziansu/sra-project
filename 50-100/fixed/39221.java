@org.junit.Test
public void testH() {
    testTaskObject = new common.TaskObject("Travel Eastern Europe and Iceland", "", "", (-1));
    testCommandObject = new common.CommandObject(INDEX_EDIT, testTaskObject, 3);
    logic.edit.Edit testEdit = new logic.edit.Edit(testCommandObject, logic.edit.EditTest.testList, logic.edit.EditTest.testList, (-1));
    logic.edit.EditTest.actualOutput = testEdit.run();
    logic.edit.EditTest.correctOutput.add("Title edited from 'Travel Eastern Europe' to 'Travel Eastern Europe and Iceland'.");
    assertEquals(logic.edit.EditTest.actualOutput, logic.edit.EditTest.correctOutput);
    logic.edit.EditTest.correctOutput.clear();
}