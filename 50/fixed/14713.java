public long getProposalsCount() {
    org.xcolab.client.contest.pojo.ContestPhase cp = org.xcolab.client.contest.ContestClient.getActivePhase(contest.getContestPK());
    if (cp != null) {
        return org.xcolab.client.proposals.ProposalsClient.getProposalCountForActiveContestPhase(cp.getContestPhasePK());
    }else {
        return 0L;
    }
}