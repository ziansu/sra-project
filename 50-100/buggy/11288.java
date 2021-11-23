@java.lang.Override
public int compare(com.Ben12345rocks.VotingPlugin.Objects.User p1, com.Ben12345rocks.VotingPlugin.Objects.User p2) {
    int p1Total = p1.getTotalVotesSite(voteSite);
    int p2Total = p1.getTotalVotesSite(voteSite);
    if (p1Total < p2Total) {
        return 1;
    }
    if (p1Total > p2Total) {
        return -1;
    }
    return 0;
}