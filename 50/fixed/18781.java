public static void clear() {
    edu.ucsb.cs.cs185.elgoodfarnsworthrabani.werewolves.Players.PLAYERS.clear();
    if ((edu.ucsb.cs.cs185.elgoodfarnsworthrabani.werewolves.Players.adapter) != null)
        edu.ucsb.cs.cs185.elgoodfarnsworthrabani.werewolves.Players.adapter.notifyDataSetChanged();
    
}