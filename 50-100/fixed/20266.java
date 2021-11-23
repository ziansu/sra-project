public static boolean isFriendly(org.bukkit.entity.Entity P, org.bukkit.entity.Entity O) {
    if ((P instanceof org.bukkit.entity.Player) && (O instanceof org.bukkit.entity.Player)) {
        org.bukkit.entity.Player player = ((org.bukkit.entity.Player) (P));
        org.bukkit.entity.Player other = ((org.bukkit.entity.Player) (O));
        com.gmail.nossr50.datatypes.party.Party PartyP = com.gmail.nossr50.party.PartyManager.getParty(player);
        if (PartyP != null) {
            return PartyP.hasMember(other.getUniqueId());
        }
    }
    return false;
}