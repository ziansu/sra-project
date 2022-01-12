public void castVote(int option, net.dv8tion.jda.core.entities.User user) {
    if (!(castedVotes.containsKey(user))) {
        votes[option] += 1;
        castedVotes.put(user, option);
    }else {
        if (castedVotes.get(user).equals(option))
            throw new java.lang.IllegalArgumentException("User attempted to vote for an option they already voted for!");
        else {
            votes[castedVotes.get(user)] -= 1;
            castedVotes.replace(user, option);
        }
    }
}