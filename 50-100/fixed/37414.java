@java.lang.Override
public java.lang.Void visit(ast.question.SimpleQuestion simpleQuestion) {
    this.checkQuestion(simpleQuestion);
    typeRepository.putID(simpleQuestion.getQuestionId().getID(), simpleQuestion.getQuestionType());
    typeRepository.putIDLabel(simpleQuestion.getQuestionId().getID(), simpleQuestion.getQuestionText());
    return null;
}