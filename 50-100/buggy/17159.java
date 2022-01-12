@java.lang.Override
protected void registerCreativeTabs() {
    addCreativeTab("buildingBricks", new java.util.function.Supplier<net.minecraft.item.Item>() {
        @java.lang.Override
        public net.minecraft.item.Item get() {
            return ModBuildingBricks.trowel;
        }
    });
    net.minecraft.creativetab.CreativeTabs tab = getCreativeTab("buildingBricks");
    ModBuildingBricks.trowel.setCreativeTab(tab);
    ModBuildingBricks.materialBag.setCreativeTab(tab);
    ModBuildingBricks.portableLadder.setCreativeTab(tab);
    for (net.minecraft.block.Block block : MaterialBlockRegistry.instance.getAllBlocks()) {
        block.setCreativeTab(tab);
    }
}