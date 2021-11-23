public void clearTinyMce() {
    questionNameTextArea = new org.ednovo.gooru.client.ui.TinyMCE(500);
    explainationTextArea = new org.ednovo.gooru.client.ui.TinyMCE(500);
    questionNameTextAreaContainer.clear();
    explainationTextAreaContainer.clear();
    questionNameTextArea.setCharacterLimit(500);
    explainationTextArea.setCharacterLimit(500);
    questionNameTextArea.getElement().setId("tinyMCEQuestionNameTextArea");
    questionNameTextArea.getElement().setAttribute("maxlength", "500");
    questionNameTextArea.markAsBlankPanel.setVisible(false);
    questionNameTextAreaContainer.add(questionNameTextArea);
    explainationTextAreaContainer.add(explainationTextArea);
}