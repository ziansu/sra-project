@org.junit.Test
public void testOnTeamSelected() {
    configureSubmitter();
    submitter.onTeamSelected(0);
    verify(mockView).clearContributors();
    verify(mockView).setTeamInEligibleErrorVisible(eq(false), anyString());
}