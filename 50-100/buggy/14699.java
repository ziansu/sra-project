@cpw.mods.fml.relauncher.SideOnly(value = cpw.mods.fml.relauncher.Side.CLIENT)
public net.minecraft.util.IIcon getIcon(int side, int meta) {
    if ((meta < 0) || ((meta >= (woodTypes.length)) && (meta < 8))) {
        meta = 0;
    }else
        if (meta > 7) {
            meta %= 8;
        }
    
    return iconArray[meta];
}