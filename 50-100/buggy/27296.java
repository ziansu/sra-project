public java.lang.String getVoteSiteItemsSkull(org.bukkit.entity.Player player, java.lang.String siteName, java.lang.String item) {
    return getData().getString((((("GUI.VoteReward." + siteName) + ".Items.") + item) + ".Skull")).replace("%Player%", player.getName());
}