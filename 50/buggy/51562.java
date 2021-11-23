@cucumber.api.java.en.And(value = "^there is not an existing proposal titled \"([^\"]*)\"$")
public void thereIsNotAnExistingProposalTitled(java.lang.String title) throws java.lang.Throwable {
    org.junit.Assert.assertTrue(proposalRepository.findByTitleContaining(title).isEmpty());
}