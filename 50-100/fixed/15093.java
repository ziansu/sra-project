public void testAddDuplicateTask() {
    int listSize = main.controller.importantList.size();
    javafx.beans.property.StringProperty notiSize = new javafx.beans.property.SimpleStringProperty(java.lang.Integer.toString((listSize - 1)));
    java.lang.String taskName = "testing1";
    main.addTask(taskName);
    main.assertErrorMessage(Constants.CMD_ERROR_CANT_ADD_DUPLICATE);
    org.junit.Assert.assertEquals(listSize, main.controller.importantList.size());
    org.junit.Assert.assertEquals(notiSize.getValue(), main.controller.incompletePlaceHdr.getValue());
}