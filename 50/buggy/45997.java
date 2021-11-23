public java.lang.String getVoteURLAlreadyVotedItemSkull(org.bukkit.entity.Player player) {
    return getData().getString("GUI.VoteURL.AlreadyVotedItem.Skull").replace("%Player%", player.getName());
}