public com.Ben12345rocks.VotingPlugin.Objects.User getVotingPluginUser(java.lang.String playerName) {
    return getVotingPluginUser(new com.Ben12345rocks.AdvancedCore.Objects.UUID(com.Ben12345rocks.AdvancedCore.Util.Misc.PlayerUtils.getInstance().getUUID(playerName)));
}