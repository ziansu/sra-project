public void addQuestion(nl.uva.se.ast.statement.Question question) {
    nl.uva.se.gui.elements.QuestionBox questionBox = new nl.uva.se.gui.elements.QuestionBox(question);
    vbox.getChildren().add(questionBox);
}