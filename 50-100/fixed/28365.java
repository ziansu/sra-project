private void submitCommandText(java.lang.String commandText) {
    if ((commandText.isEmpty()) || (commandText.equals("\n"))) {
        return ;
    }
    this.previousCommandText = commandText;
    logic.execute(previousCommandText);
    if ((previousCommandText.length()) != 0) {
        commandFeedbackView.displayMessage((("Command \"" + (previousCommandText.substring(0, java.lang.Math.min(50, previousCommandText.length())))) + "...\" executed successfully."));
    }
}