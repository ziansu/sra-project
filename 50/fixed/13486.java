public java.lang.String getMessagesReward(java.lang.String reward) {
    java.lang.String msg = getData(reward).getString("Messages.Reward", com.Ben12345rocks.VotingPlugin.Config.ConfigFormat.getInstance().getRewardMsg());
    return msg;
}