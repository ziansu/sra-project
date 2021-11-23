@org.junit.Test
public void questionsFromServerTest() {
    nl.han.oose.myenergyprofile.domain.Questions vragen = createQuestionsObject();
    org.junit.Assert.assertEquals(new nl.han.oose.myenergyprofile.domain.Hash("808561730").toString(), questionDAO.getQuestionsFromServer().getHash().toString());
    org.junit.Assert.assertEquals(vragen.getQuestions().get(0).toString(), questionDAO.getQuestionsFromServer().getQuestions().get(0).toString());
}