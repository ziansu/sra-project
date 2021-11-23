public java.lang.String getVoteURLAlreadyVotedItemSkull(org.bukkit.entity.Player player) {
    java.lang.String str = getData().getString("GUI.VoteURL.AlreadyVotedItem.Skull");
    if (str != null) {
        str = str.replace("%Player%", player.getName());
        return str;
    }
    return null;
}