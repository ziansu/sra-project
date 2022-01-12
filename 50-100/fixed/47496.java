public com.github.crainstorm.qac.pub.entity.Question getQuestion(int id) {
    com.github.crainstorm.qac.pub.entity.Question question = dao.getQuestion(id);
    if (question != null) {
        question.follow_num = dao.getQuestionFollowNum(id);
        question.answer_num = dao.getQuestionAnswerNum(id);
        question.labels.addAll(labelManageDao.getLabelsOfQuestion(id));
    }
    return question;
}