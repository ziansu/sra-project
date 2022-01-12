@java.lang.Override
public java.util.List<edu.nju.logic.vo.AnswerVO> getAnswerByName(java.lang.String name) {
    java.util.List<edu.nju.data.entity.Answer> answers = answerDAO.getAnswerByUserName(name);
    java.util.List<edu.nju.logic.vo.AnswerVO> answerVOs = new java.util.ArrayList<>();
    for (edu.nju.data.entity.Answer answer : answers) {
        answerVOs.add(timeService.transferAnswer(answer));
    }
    return answerVOs;
}