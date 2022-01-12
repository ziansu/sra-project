@java.lang.SuppressWarnings(value = { "unchecked" , "rawtypes" })
@java.lang.Override
@cpw.mods.fml.relauncher.SideOnly(value = cpw.mods.fml.relauncher.Side.CLIENT)
public void getSubItems(net.minecraft.item.Item item, net.minecraft.creativetab.CreativeTabs tab, java.util.List itemList) {
    net.minecraft.item.ItemStack paintingStack;
    java.util.List<sidben.ateliercanvas.handler.CustomPaintingConfigItem> configList = sidben.ateliercanvas.handler.ConfigurationHandler.getAllMahGoodPaintings();
    configList.sort(new sidben.ateliercanvas.handler.CustomPaintingConfigItemComparator(sidben.ateliercanvas.handler.CustomPaintingConfigItemComparator.SortingType.TITLE));
    for (final sidben.ateliercanvas.handler.CustomPaintingConfigItem configItem : configList) {
        if (sidben.ateliercanvas.handler.ConfigurationHandler.isUUIDEnabled(configItem.getUUID())) {
            paintingStack = new net.minecraft.item.ItemStack(item, 1);
            MyItems.customPainting.addPaintingData(paintingStack, configItem, false);
            itemList.add(paintingStack);
        }
    }
}