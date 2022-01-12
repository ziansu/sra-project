@java.lang.Override
public com.sv.quiz_master.user.model.Question getNextQuestion(com.sv.quiz_master.user.model.QuestionPaper questionPaper, com.sv.quiz_master.user.model.Question currentQuestion) {
    return userRepository.getNextQuestion(questionPaper, currentQuestion);
}