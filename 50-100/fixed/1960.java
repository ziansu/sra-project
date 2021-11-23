public boolean legacyFactionsClaim(org.bukkit.Location loc) {
    if (wild.getConfig().getBoolean("LegacyFactions")) {
        com.massivecraft.factions.Board board = net.redstoneore.legacyfactions.entity.Board.get();
        com.massivecraft.factions.entity.Faction faction = board.getFactionAt(new com.massivecraft.factions.FLocation(loc));
        if ((faction.isWilderness()) && (!(checkSurroundingLegacyFactions(loc))))
            return true;
        else
            return false;
        
    }
    return false;
}