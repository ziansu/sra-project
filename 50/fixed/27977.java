@java.lang.Override
public void displayGeneratedQuestions(java.util.List<de.saschafeldmann.adesso.master.thesis.generation.model.TestQuestion> testQuestions) {
    completedQuestionsList.removeAllItems();
    completedQuestionsList.addItems(testQuestions);
    triggerActionButtonsEnabledState();
}