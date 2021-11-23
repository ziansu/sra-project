private boolean requestNotAlreadyReceived(com.github.tomakehurst.wiremock.matching.RequestPattern requestPattern) {
    com.github.tomakehurst.wiremock.verification.VerificationResult verificationResult = admin.countRequestsMatching(requestPattern);
    verificationResult.assertRequestJournalEnabled();
    return (verificationResult.getCount()) < 1;
}