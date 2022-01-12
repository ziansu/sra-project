public void runRemind(com.Ben12345rocks.VotingPlugin.Objects.User user) {
    if ((com.Ben12345rocks.VotingPlugin.Config.Config.getInstance().getVoteRemindingEnabled()) && (user.canVoteAll())) {
        user.setReminded(true);
        com.Ben12345rocks.AdvancedCore.Objects.RewardHandler.getInstance().giveReward(user, com.Ben12345rocks.VotingPlugin.Config.Config.getInstance().getData(), com.Ben12345rocks.VotingPlugin.Config.Config.getInstance().getVoteRemindingRewardsPath());
        com.Ben12345rocks.VotingPlugin.VoteReminding.VoteReminding.plugin.debug(((user.getPlayerName()) + " was reminded!"));
    }
}