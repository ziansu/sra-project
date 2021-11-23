public static boolean countMobKillStat(int id) {
    if ((id < 0) || (id >= (engine.gameData.MobData.countKillStats.size())))
        return false;
    
    return engine.gameData.MobData.countKillStats.get(id);
}