public static int getNextPotionId(int start) {
    do
        start++;
    while (((((start < 256) && ((net.minecraft.potion.Potion.potionTypes) != null)) && (start > 0)) && (start < (Potion.potionTypes.length))) && ((net.minecraft.potion.Potion.potionTypes[start]) == null) );
    if (start >= 256)
        return -1;
    
    return start;
}