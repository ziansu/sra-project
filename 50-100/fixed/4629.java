@java.lang.Override
protected void ConfigurationSpecificBuildStructure(net.minecraft.entity.player.EntityPlayer player, net.minecraft.world.World world, net.minecraft.util.math.BlockPos hitBlockPos) {
    com.wuest.prefab.StructureGen.CustomStructures.StructureTreeFarm structure = com.wuest.prefab.StructureGen.CustomStructures.StructureTreeFarm.CreateInstance(StructureTreeFarm.ASSETLOCATION, com.wuest.prefab.StructureGen.CustomStructures.StructureTreeFarm.class);
    if (structure.BuildStructure(this, world, hitBlockPos, EnumFacing.NORTH, player)) {
        player.inventory.clearMatchingItems(com.wuest.prefab.ModRegistry.TreeFarm(), (-1), 1, null);
        player.inventoryContainer.detectAndSendChanges();
    }
}