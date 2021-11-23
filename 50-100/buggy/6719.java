@org.junit.Test
public void test2() {
    com.amazon.speech.speechlet.Session session = com.amazon.speech.speechlet.Session.builder().withSessionId("session").build();
    session.setAttribute(CricketSpeechlet.START_KEY, 21);
    com.amazon.speech.speechlet.SpeechletResponse result = new cricketskill.CricketSpeechlet(com.amazonaws.Protocol.HTTPS).getCurrentScoreResponse(session);
    java.lang.System.out.println(result);
}