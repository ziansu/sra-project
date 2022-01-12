private void submitCommandText(java.lang.String commandText) {
    this.previousCommandText = commandText;
    setStyleToIndicateCorrectCommand();
    logic.execute(previousCommandText);
    if ((previousCommandText.length()) != 0) {
        commandFeedbackView.displayMessage((("Command \"" + (previousCommandText.substring(0, java.lang.Math.min(50, previousCommandText.length())))) + "...\" executed successfully."));
    }
}