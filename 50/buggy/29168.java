@cucumber.api.java.en.And(value = "^there is not a submission of the proposal titled \"([^\"]*)\"$")
public void thereIsNotASubmissionOfTheProposalTitled(java.lang.String title) throws java.lang.Throwable {
    cat.udl.eps.entsoftarch.thesismarket.Proposal proposal = proposalRepository.findByTitleContaining(title).get(0);
    org.junit.Assert.assertTrue(proposalSubmissionRepository.findBySubmits(proposal).isEmpty());
}