public void refresh(microbat.model.trace.TraceNode node) {
    this.currentNode = node;
    microbat.model.BreakPointValue thisState = node.getProgramState();
    createStateContent(thisState);
    createWrittenVariableContent(node.getWrittenVariables());
    createReadVariableContect(node.getReadVariables());
    yesButton.setSelection(false);
    noButton.setSelection(true);
    unclearButton.setSelection(false);
    wrongPathButton.setSelection(false);
    boolean enabled = isValidToInferBugType();
    bugTypeInferenceButton.setEnabled(enabled);
    feedbackType = microbat.recommendation.UserFeedback.INCORRECT;
}