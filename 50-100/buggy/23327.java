@net.md_5.bungee.event.EventHandler
public void onPostLogin(net.md_5.bungee.api.event.PostLoginEvent event) {
    if ((event.getPlayer()) instanceof net.md_5.bungee.api.connection.ProxiedPlayer) {
        net.md_5.bungee.api.connection.ProxiedPlayer player = event.getPlayer();
        java.util.List<au.com.addstar.unscramble.prizes.SavedPrize> prizes = getPrizes(player, false);
        if ((prizes != null) && (!(prizes.isEmpty()))) {
            NotifyPlayerUnclaimedPrizes(player, prizes);
        }
    }
}