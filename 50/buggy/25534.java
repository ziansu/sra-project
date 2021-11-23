public void delItem() {
    this.handler.setStackInSlot(0, new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.AIR));
    this.save(net.minecraft.client.Minecraft.getMinecraft().player);
}