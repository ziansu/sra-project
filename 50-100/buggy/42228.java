public java.lang.String playerNextVote(org.bukkit.entity.Player player, java.lang.String siteName) {
    if (!(com.Ben12345rocks.VotingPlugin.Config.ConfigVoteSites.getInstance().getVoteSitesNames().contains(siteName))) {
        return "";
    }
    com.Ben12345rocks.VotingPlugin.Objects.VoteSite voteSite = com.Ben12345rocks.VotingPlugin.Util.PlaceHolders.PlaceHolders.plugin.getVoteSite(siteName);
    com.Ben12345rocks.VotingPlugin.Objects.User user = com.Ben12345rocks.VotingPlugin.UserManager.UserManager.getInstance().getVotingPluginUser(player);
    return com.Ben12345rocks.VotingPlugin.Commands.Commands.getInstance().voteCommandNextInfo(user, voteSite);
}