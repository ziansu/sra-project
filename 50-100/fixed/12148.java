@java.lang.Override
@cpw.mods.fml.relauncher.SideOnly(value = cpw.mods.fml.relauncher.Side.CLIENT)
protected net.minecraft.util.IIcon getUnderlayIcon(net.minecraft.world.IBlockAccess world, int x, int y, int z, int side) {
    int meta = world.getBlockMetadata(x, y, z);
    org.pfaa.chemica.model.IndustrialMaterial host = this.getGeoMaterial(meta).getHost();
    if (host != null) {
        net.minecraft.util.IIcon icon = getHostIcon(world, x, y, z);
        if (icon != null) {
            return icon;
        }
    }
    return this.getUnderlayIcon(side, meta);
}