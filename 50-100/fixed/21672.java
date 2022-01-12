private void updateArmorStats(gregtech.common.items.armor.ArmorData armorData, java.util.ArrayList<gregtech.common.items.armor.components.StatType> statTypes) {
    for (gregtech.common.items.armor.components.StatType statType : statTypes) {
        if (((armorData == null) || ((armorData.mStat) == null)) || (!(armorData.mStat.containsKey(statType))))
            continue;
        
        set(mStat, statType, armorData.mStat.get(statType));
    }
}