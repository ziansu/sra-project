public static boolean verifyInput() {
    java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>();
    for (edu.ucsb.cs.cs185.elgoodfarnsworthrabani.werewolves.Players.Player p : edu.ucsb.cs.cs185.elgoodfarnsworthrabani.werewolves.Players.PLAYERS) {
        if (((p.name.length()) == 0) || (!(hashSet.add(p.name.trim().toLowerCase()))))
            return false;
        
    }
    return true;
}