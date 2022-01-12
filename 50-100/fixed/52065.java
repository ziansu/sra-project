@java.lang.Override
protected void ConfigurationSpecificBuildStructure(net.minecraft.entity.player.EntityPlayer player, net.minecraft.world.World world, net.minecraft.util.math.BlockPos hitBlockPos) {
    com.wuest.prefab.StructureGen.CustomStructures.StructureVillagerHouses structure = com.wuest.prefab.StructureGen.CustomStructures.StructureVillagerHouses.CreateInstance(this.houseStyle.getStructureLocation(), com.wuest.prefab.StructureGen.CustomStructures.StructureVillagerHouses.class);
    if (structure.BuildStructure(this, world, hitBlockPos, EnumFacing.NORTH, player)) {
        net.minecraft.item.ItemStack stack = ((player.getHeldItemMainhand().getItem()) instanceof com.wuest.prefab.Items.Structures.ItemVillagerHouses) ? player.getHeldItemMainhand() : player.getHeldItemOffhand();
        stack.damageItem(1, player);
        player.inventoryContainer.detectAndSendChanges();
    }
}