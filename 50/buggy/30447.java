public int getUpgradeLevel(de.manimax3.armor.UpgradeType type) {
    if (upgrades.containsKey(type))
        return upgrades.get(type);
    
    return -1;
}