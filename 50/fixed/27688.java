public void addCandidate(java.lang.String cand) throws CandidateExistsException {
    ballot.add(cand);
    votes.addCandidate(cand);
}