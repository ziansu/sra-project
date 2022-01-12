@java.lang.Override
public int extractEnergy(net.minecraftforge.common.util.ForgeDirection from, int maxExtract, boolean simulate) {
    if ((getCore()) != null) {
        com.pauljoda.modularsystems.generator.tiles.TileGeneratorCore core = ((com.pauljoda.modularsystems.generator.tiles.TileGeneratorCore) (getCore()));
        return core.extractEnergy(from, maxExtract, simulate);
    }
    return 0;
}