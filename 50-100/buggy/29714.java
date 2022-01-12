public static double eraRate(com.avrgaming.civcraft.object.Civilization civ) {
    double rate = 1.0;
    double era = ((com.avrgaming.civcraft.main.CivGlobal.highestCivEra) - 1) - (civ.getCurrentEra());
    if (era > 0) {
        rate = era / 10;
    }
    return rate;
}