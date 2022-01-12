@java.lang.Override
protected void ConfigurationSpecificBuildStructure(net.minecraft.entity.player.EntityPlayer player, net.minecraft.world.World world, net.minecraft.util.math.BlockPos hitBlockPos) {
    com.wuest.prefab.StructureGen.CustomStructures.StructureModerateHouse structure = com.wuest.prefab.StructureGen.CustomStructures.StructureModerateHouse.CreateInstance(this.houseStyle.getStructureLocation(), com.wuest.prefab.StructureGen.CustomStructures.StructureModerateHouse.class);
    structure.BuildStructure(this, world, hitBlockPos, EnumFacing.NORTH, player);
    player.inventory.clearMatchingItems(com.wuest.prefab.ModRegistry.ModerateHouse(), (-1), 1, null);
    player.inventoryContainer.detectAndSendChanges();
}