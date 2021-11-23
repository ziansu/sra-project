public static void registerModItems() {
    fr.dustrufous.main.item.DRItems.testWaterBall = new fr.dustrufous.main.item.ItemWaterballTEST().setCreativeTab(CreativeTabs.COMBAT).setUnlocalizedName("testWaterBall");
    net.minecraftforge.fml.common.registry.GameRegistry.registerItem(fr.dustrufous.main.item.DRItems.testWaterBall, "testWaterBall");
}