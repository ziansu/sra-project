private void remove(com.palmergames.bukkit.towny.object.Town attacker, com.palmergames.bukkit.towny.object.Town town) throws com.palmergames.bukkit.towny.exceptions.NotRegisteredException {
    int fallenTownBlocks = 0;
    warringTowns.remove(town);
    for (com.palmergames.bukkit.towny.object.TownBlock townBlock : town.getTownBlocks())
        if (warZone.containsKey(townBlock.getWorldCoord())) {
            fallenTownBlocks++;
            remove(townBlock.getWorldCoord());
        }
    
    townScored(attacker, com.palmergames.bukkit.towny.TownySettings.getWarPointsForTown(), town, fallenTownBlocks);
}