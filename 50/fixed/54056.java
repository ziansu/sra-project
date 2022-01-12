public void onInit(net.minecraftforge.fml.common.event.FMLInitializationEvent event) {
    com.tictacfoe.medieval.common.item.ModItems.registerOreDic();
    com.tictacfoe.medieval.common.block.ModBlocks.registerOreDic();
    com.tictacfoe.medieval.common.recipe.TTFRecipes.register();
    com.tictacfoe.medieval.common.block.ModBlocks.registerTileEntities();
}