private void QuestionsListValueChanged(javax.swing.event.ListSelectionEvent evt) {
    test.Main.index = QuestionsList.getSelectedIndex();
    loadQuest(test.Main.index);
}