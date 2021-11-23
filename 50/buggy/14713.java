public long getProposalsCount() {
    org.xcolab.client.contest.pojo.ContestPhase cp = org.xcolab.client.contest.ContestClient.getActivePhase(contest.getContestPK());
    return org.xcolab.client.proposals.ProposalsClient.getProposalCountForActiveContestPhase(cp.getContestPhasePK());
}