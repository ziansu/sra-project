@org.junit.Test
public void execute_fontSizeChangedToNormal_success() throws java.lang.Exception {
    seedu.address.logic.commands.CustomiseCommand customiseCommand = prepareCommand(new seedu.address.model.font.FontSize(seedu.address.logic.commands.CustomiseCommand.FONT_SIZE_NORMAL));
    java.lang.String expectedMessage = ((seedu.address.logic.commands.CustomiseCommand.MESSAGE_SUCCESS) + (seedu.address.logic.commands.CustomiseCommand.FONT_SIZE_NORMAL)) + ".";
    org.junit.Assert.assertEquals(expectedMessage, customiseCommand.execute().feedbackToUser);
}