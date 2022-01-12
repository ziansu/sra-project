private boolean loadFromDB() {
    prefix = caexbot.database.CaexDB.loadPrefixes().get(guild);
    guildXP = caexbot.database.CaexDB.getLevels().get(guild);
    if (((prefix) != null) && ((guildXP) != null))
        return true;
    else
        return false;
    
}