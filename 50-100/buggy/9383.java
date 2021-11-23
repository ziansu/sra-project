private int getUnitCount(SCBot.UnitType type, SCBot.UnitType type2) {
    int count = 0;
    for (SCBot.Unit u : self.getUnits()) {
        if (((u.getType()) == type) && ((type2 == null) || ((u.getBuildType()) == type2))) {
            count++;
        }
    }
    return count;
}