public boolean canVoteAll() {
    for (com.Ben12345rocks.VotingPlugin.Objects.VoteSite voteSite : com.Ben12345rocks.VotingPlugin.Objects.User.plugin.getVoteSites()) {
        boolean canVote = canVoteSite(voteSite);
        if (!canVote) {
            return false;
        }
    }
    return true;
}