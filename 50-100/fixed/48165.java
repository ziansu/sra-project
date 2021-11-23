@java.lang.Override
@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
public void addInformation(net.minecraft.item.ItemStack itemStack, @javax.annotation.Nullable
net.minecraft.world.World world, java.util.List<java.lang.String> tooltip, net.minecraft.client.util.ITooltipFlag advanced) {
    if (!(itemStack.hasTagCompound())) {
        return ;
    }
    net.minecraft.nbt.NBTTagCompound nbt = itemStack.getTagCompound();
    if ((nbt != null) && (nbt.hasKey("biomeIDToFind"))) {
        net.minecraft.world.biome.Biome biomeToFind = net.minecraft.world.biome.Biome.getBiome(nbt.getInteger("biomeIDToFind"));
        if (biomeToFind != null) {
            tooltip.add(biomeToFind.getBiomeName());
        }
    }
}