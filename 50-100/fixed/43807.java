@cucumber.api.java.en.And(value = "^there is not a publication of the submission of the proposal titled \"([^\"]*)\"$")
public void thereIsNotAPublicationOfTheSubmissionOfTheProposalTitled(java.lang.String title) throws java.lang.Throwable {
    cat.udl.eps.entsoftarch.thesismarket.Proposal proposal = proposalRepository.findByTitleContaining(title).get(0);
    cat.udl.eps.entsoftarch.thesismarket.ProposalSubmission proposalSubmission = proposalSubmissionRepository.findBySubmits(proposal).get(0);
    assertNull(proposalSubmission.getPublishedBy());
}