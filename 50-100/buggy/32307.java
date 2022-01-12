@java.lang.Override
public void addQuestion(pt.uc.dei.aor.project.business.model.IScript script, java.lang.String questionText, java.lang.String questionType, java.util.List<java.lang.String> options) throws pt.uc.dei.aor.project.business.exception.IllegalAnswerOptionsException, pt.uc.dei.aor.project.business.exception.IllegalQuestionTypeException {
    java.lang.System.out.println(options);
    if (!("Escolha múltipla".equals(questionType)))
        throw new pt.uc.dei.aor.project.business.exception.IllegalQuestionTypeException();
    
    if ((options == null) || ((options.size()) <= 1))
        throw new pt.uc.dei.aor.project.business.exception.IllegalAnswerOptionsException();
    
    script.addQuestion(questionText, questionType, options);
}