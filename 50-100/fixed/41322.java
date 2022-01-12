@net.md_5.bungee.event.EventHandler
public void onDisconnect(net.md_5.bungee.api.event.PlayerDisconnectEvent e) {
    net.md_5.bungee.api.connection.ProxiedPlayer player = e.getPlayer();
    ch.batthomas.partysystem.util.Party party = plugin.getPartyManager().getParty(player);
    if (party != null) {
        if (party.getLeader().equals(player)) {
            party.removeLeader();
        }else {
            party.removePlayer(player);
        }
    }
}