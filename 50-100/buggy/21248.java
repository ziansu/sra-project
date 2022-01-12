@java.lang.Override
public double getDurabilityForDisplay(net.minecraft.item.ItemStack stack) {
    return ((double) (stack.getCapability(ChargeProvider.CHARGE_CAPABILITY, null).getCharge())) / ((double) (stack.getCapability(ChargeProvider.CHARGE_CAPABILITY, null).getMaxCharge()));
}