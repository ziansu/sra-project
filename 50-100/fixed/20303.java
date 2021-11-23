public static com.github.leomagis.magis.enums.EnumCompoundType getFromStack(net.minecraft.item.ItemStack itemStack) {
    com.github.leomagis.magis.enums.EnumCompoundType[] types = com.github.leomagis.magis.enums.EnumCompoundType.values();
    int damageValue = itemStack.getItemDamage();
    if ((damageValue < 0) || (damageValue >= (types.length))) {
        damageValue = 0;
    }
    return types[damageValue];
}