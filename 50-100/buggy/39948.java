@cpw.mods.fml.relauncher.SideOnly(value = cpw.mods.fml.relauncher.Side.CLIENT)
@java.lang.Override
public net.minecraft.util.IIcon getIcon(int side, int metadata) {
    if (side == 1) {
        return com.minecraftdevin.fruitcharcoal.block.BlockPumpkinCharcoal.topIcon;
    }
    if ((metadata & 7) == side) {
        return com.minecraftdevin.fruitcharcoal.block.BlockPumpkinCharcoal.frontIcon;
    }
    if (side == 0) {
        return com.minecraftdevin.fruitcharcoal.block.BlockPumpkinCharcoal.bottomIcon;
    }
    if (side == 3) {
        return com.minecraftdevin.fruitcharcoal.block.BlockPumpkinCharcoal.frontIcon;
    }else {
        return this.sideIcon;
    }
}