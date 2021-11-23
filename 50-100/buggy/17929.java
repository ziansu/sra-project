public static net.minecraft.block.Block registerDoor(biomesoplenty.common.block.BlockBOPDoor door_block, java.lang.String name, net.minecraft.item.Item door_item) {
    net.minecraft.block.Block block = biomesoplenty.common.init.ModBlocks.registerBlock(door_block, (name + "_block"), null);
    door_item = biomesoplenty.common.init.ModItems.registerItem(new net.minecraft.item.ItemDoor(block), name);
    door_block.setDoorItem(door_item);
    return block;
}