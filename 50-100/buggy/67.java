private void toggleHollowShape(net.minecraft.entity.player.EntityPlayer player, net.minecraft.item.ItemStack stack, net.minecraft.item.Item item) {
    boolean isWire = ((com.phylogeny.extrabitmanipulation.item.ItemSculptingTool) (item)).removeBits();
    boolean isHollowShape = !(com.phylogeny.extrabitmanipulation.helper.SculptSettingsHelper.isHollowShape(player, stack.getTagCompound(), isWire));
    com.phylogeny.extrabitmanipulation.helper.SculptSettingsHelper.setHollowShape(player, stack, isHollowShape, isWire);
    if ((isWire ? com.phylogeny.extrabitmanipulation.reference.Configs.sculptHollowShapeWire : com.phylogeny.extrabitmanipulation.reference.Configs.sculptHollowShapeSpade).shouldDisplayInChat()) {
        printChatMessageWithDeletion(com.phylogeny.extrabitmanipulation.helper.SculptSettingsHelper.getHollowShapeText(isHollowShape));
    }
}