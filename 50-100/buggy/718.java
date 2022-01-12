@java.lang.Override
public void returnWailaBody(java.util.List<java.lang.String> list) {
    if ((getCore()) != null) {
        com.pauljoda.modularsystems.generator.tiles.TileGeneratorCore core = ((com.pauljoda.modularsystems.generator.tiles.TileGeneratorCore) (getCore()));
        list.add(((((GuiHelper.GuiColor.YELLOW) + "Max RF/t Out: ") + (GuiHelper.GuiColor.RED)) + (core.MAX_RFTICK_OUT)));
    }
}