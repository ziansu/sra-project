private void remove(com.palmergames.bukkit.towny.object.Town attacker, com.palmergames.bukkit.towny.object.Nation nation) throws com.palmergames.bukkit.towny.exceptions.NotRegisteredException {
    townScored(attacker, com.palmergames.bukkit.towny.TownySettings.getWarPointsForNation(), nation, 0);
    warringNations.remove(nation);
    for (com.palmergames.bukkit.towny.object.Town town : nation.getTowns())
        if (warringTowns.contains(town))
            remove(attacker, town);
        
    
    checkEnd();
}