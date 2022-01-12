public static net.minecraftforge.common.util.ForgeDirection calcLocalDirection(net.minecraftforge.common.util.ForgeDirection value, net.minecraftforge.common.util.ForgeDirection face) {
    int n = mods.ocminecart.common.util.RotationHelper.indexHelperArray(face);
    int d = mods.ocminecart.common.util.RotationHelper.indexHelperArray(value);
    if ((n < 0) || (d < 0))
        return value;
    
    return mods.ocminecart.common.util.RotationHelper.dir[(((d + n) + 4) % 4)];
}