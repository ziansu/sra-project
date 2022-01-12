public java.lang.String getVoteSiteItemsSkull(org.bukkit.entity.Player player, java.lang.String siteName, java.lang.String item) {
    java.lang.String str = getData().getString((((("GUI.VoteReward." + siteName) + ".Items.") + item) + ".Skull"));
    if (str != null) {
        str = str.replace("%Player%", player.getName());
        return str;
    }
    return null;
}