@java.lang.Override
public boolean canDrain(net.minecraftforge.common.util.ForgeDirection from, com.nik7.upgcraft.tileentities.Fluid fluid) {
    return (fluid == null) || ((fluid.getBlock()) == (com.nik7.upgcraft.init.ModBlocks.blockActiveLava));
}