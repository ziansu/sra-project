private void add(com.palmergames.bukkit.towny.object.Town town) {
    com.palmergames.bukkit.towny.TownyMessaging.sendTownMessage(town, com.palmergames.bukkit.towny.TownySettings.getJoinWarMsg(town));
    townScores.put(town, 0);
    warringTowns.add(town);
    for (com.palmergames.bukkit.towny.object.TownBlock townBlock : town.getTownBlocks())
        if (town.isHomeBlock(townBlock))
            warZone.put(townBlock.getWorldCoord(), com.palmergames.bukkit.towny.TownySettings.getWarzoneHomeBlockHealth());
        else
            warZone.put(townBlock.getWorldCoord(), com.palmergames.bukkit.towny.TownySettings.getWarzoneTownBlockHealth());
        
    
}