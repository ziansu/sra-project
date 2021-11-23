@javax.annotation.Nullable
@java.lang.Override
public net.minecraft.item.ItemStack getCraftingResult(net.minecraft.inventory.InventoryCrafting inv) {
    net.minecraft.item.ItemStack output = net.minecraftforge.items.ItemHandlerHelper.copyStackWithSize(barrelStack, 1);
    upgradeStack.getCapability(YabbaCommon.UPGRADE_CAPABILITY, null).applyOn(((com.latmod.yabba.api.IBarrelModifiable) (output.getCapability(YabbaCommon.BARREL_CAPABILITY, null))), worldObj, false);
    return output;
}