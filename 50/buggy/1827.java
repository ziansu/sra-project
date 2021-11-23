private void addVoteTo(java.util.HashMap<java.lang.String, java.lang.Integer> votes, java.lang.String candidate) {
    votes.put(candidate, (((java.lang.Integer) (numFirstVotes.get(candidate).intValue())) + 1));
}