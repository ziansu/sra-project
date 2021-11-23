protected void addFermentTooltips(net.minecraftforge.fluids.FluidStack fluid, java.util.List<java.lang.String> tooltip) {
    if (fluid == null)
        return ;
    
    if ((fluid.amount) <= 0)
        return ;
    
    addFluidTooltips(fluid, tooltip);
    if (!(growthcraft.api.cellar.CellarRegistry.instance().fermenting().canFerment(fluid))) {
        tooltip.add("");
        tooltip.add(((net.minecraft.util.EnumChatFormatting.RED) + (growthcraft.api.core.i18n.GrcI18n.translate("gui.grc.cantferment"))));
    }
}