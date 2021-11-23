@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
@java.lang.Override
public net.minecraft.util.math.AxisAlignedBB getRenderBoundingBox() {
    int xCoord = getPos().getX();
    int yCoord = getPos().getY();
    int zCoord = getPos().getZ();
    return new net.minecraft.util.math.AxisAlignedBB((xCoord - 1), ((yCoord - (size)) - 1), (zCoord - 1), ((xCoord + (size)) + 1), (yCoord + 1), ((zCoord + (size)) + 1));
}