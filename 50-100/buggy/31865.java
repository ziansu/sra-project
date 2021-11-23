public boolean build(Player p, SOC.buildType b, SOC.location loc) {
    if (!(canBuild(p, b, loc)))
        return false;
    
    m_buildings[loc.ordinal()] = SOC.buildType.SETTLEMENT;
    m_players[loc.ordinal()] = p;
    m_givecards.add(p);
    return true;
}