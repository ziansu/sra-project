@org.junit.Test
public void questionsFromServerTest() {
    nl.han.oose.myenergyprofile.domain.Questions vragen = createQuestionsObject();
    org.junit.Assert.assertEquals(questionDAO.getQuestionsFromServer().getHash().toString(), questionDAO.getQuestionsFromServer().getHash().toString());
    org.junit.Assert.assertEquals(vragen.getQuestions().get(0).toString(), questionDAO.getQuestionsFromServer().getQuestions().get(0).toString());
}