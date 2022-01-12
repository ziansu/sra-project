private int getPlateletTime(net.minecraft.entity.EntityLivingBase e) {
    if (e != null) {
        if (!(flaxbeard.cyberware.common.item.ItemHeartUpgrade.timesPlatelets.containsKey(e))) {
            flaxbeard.cyberware.common.item.ItemHeartUpgrade.timesPlatelets.put(e, e.ticksExisted);
        }
        return (e.ticksExisted) - (flaxbeard.cyberware.common.item.ItemHeartUpgrade.timesPlatelets.get(e));
    }
    return 0;
}