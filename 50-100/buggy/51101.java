public static int getNextPotionId(int start) {
    if (((((net.minecraft.potion.Potion.potionTypes) != null) && (start > 0)) && (start < (Potion.potionTypes.length))) && ((net.minecraft.potion.Potion.potionTypes[start]) == null))
        return start;
    
    start++;
    if (start < 256)
        start = blusunrize.immersiveengineering.common.util.IEPotions.getNextPotionId(start);
    else
        start = -1;
    
    return start;
}