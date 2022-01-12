private int getMedkitTime(net.minecraft.entity.EntityLivingBase e) {
    if (e != null) {
        if (!(flaxbeard.cyberware.common.item.ItemHeartUpgrade.timesMedkit.containsKey(e))) {
            flaxbeard.cyberware.common.item.ItemHeartUpgrade.timesMedkit.put(e, e.ticksExisted);
            flaxbeard.cyberware.common.item.ItemHeartUpgrade.damageMedkit.put(e, 0.0F);
            return 0;
        }
        return (e.ticksExisted) - (flaxbeard.cyberware.common.item.ItemHeartUpgrade.timesMedkit.get(e));
    }
    return 0;
}