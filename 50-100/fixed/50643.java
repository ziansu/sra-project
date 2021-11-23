@java.lang.Override
public java.util.List<edu.nju.logic.vo.QuestionVO> getQuestionByName(java.lang.String name) {
    java.util.List<edu.nju.data.entity.Question> questions = questionDAO.getQuestionByUsername(name);
    if (questions == null)
        return new java.util.ArrayList<edu.nju.logic.vo.QuestionVO>();
    
    java.util.List<edu.nju.logic.vo.QuestionVO> questionVOs = new java.util.ArrayList<>();
    for (edu.nju.data.entity.Question question : questions) {
        questionVOs.add(timeService.transferQuestion(question));
    }
    return questionVOs;
}