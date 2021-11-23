public static int getPartialStatFor(pcgen.core.PlayerCharacter aPC, pcgen.core.PCStat stat, boolean useTemp, boolean useEquip) {
    if (aPC.hasNonStatStat(stat)) {
        return 10;
    }
    if (!(aPC.hasUnlockedStat(stat))) {
        java.lang.Number val = aPC.getLockedStat(stat);
        if (val != null) {
            return val.intValue();
        }
    }
    int y = aPC.getPartialStatFor(stat, useTemp, useEquip);
    return y;
}