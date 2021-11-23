@me.geocraft.shops.citizens.EventHandler
public void onRClick(me.geocraft.shops.citizens.NPCRightClickEvent event) {
    if (((event.isCancelled()) || (!(event.getNPC().equals(getNPC())))) || (!(onClick))) {
        return ;
    }
    me.geocraft.shops.citizens.Player buyer = event.getClicker();
    if (canTrade(buyer))
        trade(buyer);
    else {
        buyer.sendMessage("\u00a74You do not have permission to trade!");
        event.setCancelled(true);
    }
}