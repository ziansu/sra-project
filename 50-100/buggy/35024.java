private void loadConfigValues() {
    final java.util.List<sidben.ateliercanvas.handler.CustomPaintingConfigItem> configList = sidben.ateliercanvas.handler.ConfigurationHandler.getAllMahGoodPaintings();
    configList.sort(new sidben.ateliercanvas.handler.CustomPaintingConfigItemComparator(listSorting));
    this.paintingList = new java.util.ArrayList<sidben.ateliercanvas.client.gui.GuiElementPaintingListEntry>();
    for (final sidben.ateliercanvas.handler.CustomPaintingConfigItem item : configList) {
        this.paintingList.add(new sidben.ateliercanvas.client.gui.GuiElementPaintingListEntry(this, item));
    }
}