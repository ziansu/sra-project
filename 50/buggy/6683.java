@java.lang.Override
protected void dropFewItems(boolean hitByPlayer, int lootingLvl) {
    if (SpiderCore.rand.nextBoolean()) {
        dropItem(net.minecraft.item.Item.getItemFromBlock(ModBlocks.stinger), 1.0F);
    }
}