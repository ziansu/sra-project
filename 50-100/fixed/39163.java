public void runRemind(com.Ben12345rocks.VotingPlugin.Objects.User user) {
    if ((com.Ben12345rocks.VotingPlugin.Config.Config.getInstance().getVoteRemindingEnabled()) && (user.canVoteAll())) {
        user.setReminded(true);
        giveReward(user);
        com.Ben12345rocks.VotingPlugin.VoteReminding.VoteReminding.plugin.debug(((user.getPlayerName()) + " was reminded!"));
    }
}