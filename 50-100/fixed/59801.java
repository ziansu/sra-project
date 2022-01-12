@java.lang.Override
public void drawEnergy(double v) {
    if ((getCore()) instanceof com.pauljoda.modularsystems.generator.tiles.TileGeneratorCore) {
        com.pauljoda.modularsystems.generator.tiles.TileGeneratorCore core = ((com.pauljoda.modularsystems.generator.tiles.TileGeneratorCore) (getCore()));
        double convertedPower = convertFromEU(v);
        core.extractEnergy(null, ((int) (java.lang.Math.round(convertedPower))), false);
        worldObj.markBlockForUpdate(coreLocation.x, coreLocation.y, coreLocation.z);
    }
}