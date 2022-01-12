@cpw.mods.fml.relauncher.SideOnly(value = cpw.mods.fml.relauncher.Side.CLIENT)
public net.minecraft.util.IIcon getIcon(int side, int meta) {
    if (meta > 7) {
        meta %= 8;
    }
    if ((meta < 0) || ((meta >= (woodTypes.length)) && (meta <= 7))) {
        meta = 0;
    }
    return iconArray[meta];
}