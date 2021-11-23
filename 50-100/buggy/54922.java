@java.lang.Override
public void returnWailaHead(java.util.List<java.lang.String> list) {
    if ((getCore()) != null) {
        com.pauljoda.modularsystems.generator.tiles.TileGeneratorCore core = ((com.pauljoda.modularsystems.generator.tiles.TileGeneratorCore) (getCore()));
        list.add((((((((GuiHelper.GuiColor.YELLOW) + "Available Power: ") + (GuiHelper.GuiColor.WHITE)) + (core.getEnergyStored(null))) + "/") + (core.getMaxEnergyStored(null))) + " RF"));
    }
}