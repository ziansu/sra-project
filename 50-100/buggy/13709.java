@java.lang.Override
public void setToDefault() {
    for (net.minecraft.enchantment.Enchantment enchantment_0 : net.minecraft.enchantment.Enchantment.enchantmentsList) {
        if ((enchantment_0 != null) && (vdvman1.betterAnvil.common.Utils.getEnchName(enchantment_0).equals(propertyName))) {
            super.set(enchantment_0.getMaxLevel());
            break;
        }
    }
}