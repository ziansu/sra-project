public void clear(org.bukkit.command.CommandSender sender, java.util.UUID idFromPlayerToClear) {
    java.util.ArrayList<b2c.simpleinvite.Invite> invitesFromPlayer = b2c.simpleinvite.Invite.getInvitesFromPlayer(((b2c.simpleinvite.io.Config.INVITE_INTERVAL_TIME) * 60000), player.getUniqueId());
    Invite.INVITATIONEN.removeAll(invitesFromPlayer);
}