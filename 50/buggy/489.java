@java.lang.Override
public net.minecraft.client.resources.model.ModelResourceLocation getModelLocation(net.minecraft.item.ItemStack stack) {
    if (vazkii.botania.common.item.ItemSpawnerMover.hasData(stack)) {
        return new net.minecraft.client.resources.model.ModelResourceLocation("botania:spawnerMover", "inventory");
    }else {
        return new net.minecraft.client.resources.model.ModelResourceLocation("botania:spawnerMoverFull", "inventory");
    }
}