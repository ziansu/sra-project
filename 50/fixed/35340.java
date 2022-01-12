private void add(com.palmergames.bukkit.towny.object.Nation nation) {
    for (com.palmergames.bukkit.towny.object.Town town : nation.getTowns())
        add(town);
    
    warringNations.add(nation);
}