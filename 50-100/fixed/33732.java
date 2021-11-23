@java.lang.Override
@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
public void getSubItems(@javax.annotation.Nonnull
net.minecraft.item.Item item, net.minecraft.creativetab.CreativeTabs tab, joshie.harvest.tools.item.NonNullList<net.minecraft.item.ItemStack> list) {
    net.minecraft.item.ItemStack unleveled = new net.minecraft.item.ItemStack(item);
    getCapability(unleveled).fill(new net.minecraftforge.fluids.FluidStack(net.minecraftforge.fluids.FluidRegistry.WATER, 128), true);
    list.add(unleveled);
}