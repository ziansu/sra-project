private void addAnswersList(java.lang.String answer, int trueAnswerNumber, long keyQuestion) {
    tel_ran.tests.services.EntityAnswer temp = new tel_ran.tests.services.EntityAnswer();
    tel_ran.tests.services.EntityQuestion quest = em.find(tel_ran.tests.services.EntityQuestion.class, keyQuestion);
    temp.setAnswerText(answer);
    temp.setQuestionId(quest);
    if (trueAnswerNumber == ((int) (j))) {
        temp.setAnswer(true);
    }else {
        temp.setAnswer(false);
    }
    em.persist(temp);
}