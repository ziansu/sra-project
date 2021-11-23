public boolean legacyFactionsClaim(org.bukkit.Location loc) {
    com.massivecraft.factions.Board board = net.redstoneore.legacyfactions.entity.Board.get();
    if (wild.getConfig().getBoolean("LegacyFactions")) {
        com.massivecraft.factions.entity.Faction faction = board.getFactionAt(new com.massivecraft.factions.FLocation(loc));
        if ((faction.isWilderness()) && (!(checkSurroundingLegacyFactions(loc))))
            return true;
        else
            return false;
        
    }
    return false;
}