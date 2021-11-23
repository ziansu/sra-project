@java.lang.Override
protected void registerCreativeTabs() {
    addCreativeTab("buildingBricks", ModBuildingBricks.trowel);
    net.minecraft.creativetab.CreativeTabs tab = getCreativeTab("buildingBricks");
    ModBuildingBricks.trowel.setCreativeTab(tab);
    ModBuildingBricks.materialBag.setCreativeTab(tab);
    ModBuildingBricks.portableLadder.setCreativeTab(tab);
    for (net.minecraft.block.Block block : MaterialBlockRegistry.instance.getAllBlocks()) {
        block.setCreativeTab(tab);
    }
}