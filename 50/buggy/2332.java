public boolean canVoteAll() {
    java.util.ArrayList<com.Ben12345rocks.VotingPlugin.Objects.VoteSite> voteSites = com.Ben12345rocks.VotingPlugin.Objects.User.plugin.getVoteSites();
    for (com.Ben12345rocks.VotingPlugin.Objects.VoteSite voteSite : voteSites) {
        boolean canVote = canVoteSite(voteSite);
        if (!canVote) {
            return false;
        }
    }
    return true;
}