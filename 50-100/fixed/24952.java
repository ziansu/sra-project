@org.junit.Test
public void testSubmitTeamName() {
    setCurrentState("register-team");
    org.springframework.webflow.test.MockExternalContext context = new org.springframework.webflow.test.MockExternalContext();
    getFlowScope().put("teamSetupForm", createTeamSetupForm("The Jets", "When you're a Jet you're a Jet"));
    context.setEventId("continue");
    resumeFlow(context);
    assertCurrentStateEquals("register-team-members");
}