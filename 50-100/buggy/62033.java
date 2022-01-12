public void testAddEmptyTask() {
    int listSize = main.controller.importantList.size();
    javafx.beans.property.StringProperty notiSize = new javafx.beans.property.SimpleStringProperty(java.lang.Integer.toString(listSize));
    main.addTask("\" \"");
    main.assertErrorMessage(Constants.CMD_ERROR_CANT_ADD_EMPTY);
    org.junit.Assert.assertEquals(listSize, main.controller.importantList.size());
    org.junit.Assert.assertEquals(notiSize.getValue(), main.controller.incompletePlaceHdr.getValue());
}