@javax.annotation.Nonnull
@java.lang.Override
public eiteam.esteemedinnovation.armor.exosuit.ExosuitEventHandler[] getInstalledEventHandlers(net.minecraft.item.ItemStack self) {
    java.util.List<eiteam.esteemedinnovation.armor.exosuit.ExosuitEventHandler> handlers = java.util.Arrays.asList(getUpgrades(self));
    if ((self.hasTagCompound()) && (self.getTagCompound().hasKey("plate"))) {
        handlers.add(eiteam.esteemedinnovation.armor.exosuit.UtilPlates.getPlate(self.getTagCompound().getString("plate")));
    }
    return handlers.toArray(new eiteam.esteemedinnovation.armor.exosuit.ExosuitEventHandler[handlers.size()]);
}