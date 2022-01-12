protected void registerRendering() {
    GreenPower.proxy.addRenderRegister(new net.minecraft.item.ItemStack(this), this.getRegistryName(), "inventory");
}