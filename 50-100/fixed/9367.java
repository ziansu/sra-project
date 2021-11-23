public boolean hasUpgrade(int rarity, Lib.summon.Awakening[] awakening) {
    for (Lib.summon.Awakening a : awakening) {
        for (int i = 0; i < (a.units.length); i++) {
            if (a.units[i].name.equals(name)) {
                return hasUpgrade(rarity, a.rarityAwakened[i]);
            }
        }
    }
    return false;
}