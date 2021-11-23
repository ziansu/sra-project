public void addQuestion(nl.uva.se.ast.statement.Question question, boolean isFromCondition) {
    nl.uva.se.gui.elements.QuestionBox questionBox = new nl.uva.se.gui.elements.QuestionBox(question);
    questionBox.setVisible((!isFromCondition));
    vbox.getChildren().add(questionBox);
}