protected void addFermentTooltips(net.minecraftforge.fluids.FluidStack fluid, java.util.List<java.lang.String> tooltip) {
    if (fluid == null)
        return ;
    
    if ((fluid.amount) <= 0)
        return ;
    
    if (growthcraft.api.cellar.CellarRegistry.instance().fermenting().canFerment(fluid)) {
        addFluidTooltips(fluid, tooltip);
    }else {
        tooltip.add(fluid.getLocalizedName());
        tooltip.add("");
        tooltip.add(((net.minecraft.util.EnumChatFormatting.RED) + (growthcraft.api.core.i18n.GrcI18n.translate("gui.grc.cantferment"))));
    }
}