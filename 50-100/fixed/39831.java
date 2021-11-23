public void onDeath(net.minecraft.util.DamageSource cause) {
    super.onDeath(cause);
    net.minecraft.inventory.InventoryHelper.dropInventoryItems(this.world, this.getPosition(), this.workerInventory);
    if ((!(this.world.isRemote)) && ((this.Mainspring) != null)) {
        this.entityDropItem(this.Mainspring, 0.5F);
    }
}