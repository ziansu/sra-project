@org.junit.Test
public void testSubmitTeamName() {
    setCurrentState("register-team");
    com.chariot.games.quizzo.web.flow.QuizzoFlowManager quizzoFlowManager = mock(com.chariot.games.quizzo.web.flow.QuizzoFlowManager.class);
    org.springframework.webflow.test.MockExternalContext context = new org.springframework.webflow.test.MockExternalContext();
    org.springframework.webflow.core.collection.MutableAttributeMap map = new org.springframework.webflow.core.collection.LocalAttributeMap();
    org.springframework.webflow.test.MockFlowBuilderContext flowBuilderContext = new org.springframework.webflow.test.MockFlowBuilderContext("playQuizzo", map);
    getFlowScope().put("teamSetupForm", createTeamSetupForm("The Jets", "When you're a Jet you're a Jet"));
    flowBuilderContext.registerBean("quizzoFlowManager", quizzoFlowManager);
    context.setEventId("continue");
    resumeFlow(context);
    assertCurrentStateEquals("register-team-members");
}