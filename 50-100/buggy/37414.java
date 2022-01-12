@java.lang.Override
public java.lang.Void visit(ast.question.SimpleQuestion simpleQuestion) {
    this.checkQuestion(simpleQuestion);
    typeRepository.putID(simpleQuestion.getQuestionId().getID(), simpleQuestion.getQuestionType());
    typeRepository.putIDLabel(simpleQuestion.getQuestionId().getID(), simpleQuestion.getQuestionText());
    java.lang.System.out.println(("typerep: " + (this.typeRepository.getTypeRepository())));
    return null;
}