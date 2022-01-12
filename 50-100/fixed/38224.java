private static java.lang.String executeRetrieveOriginalText(java.lang.String userInput) {
    java.lang.String systemMsg = null;
    java.lang.String targetId = application.InputParser.getTargetIdFromString(userInput);
    application.Task originalTask = Main.list.getTaskById(targetId);
    if (originalTask != null) {
        application.Execution.headerController.textArea.appendText((((Constant.DELIMITER_UPDATE) + " ") + (originalTask.getOriginalText())));
        Main.toUpdate = true;
        systemMsg = Constant.MSG_ORIGINAL_RETRIEVED;
    }else {
        systemMsg = Constant.MSG_ORIGINAL_NOT_RETRIEVED;
    }
    return systemMsg;
}