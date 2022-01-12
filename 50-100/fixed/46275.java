private boolean createPotion() {
    net.minecraft.entity.item.EntityItem potionEntity = new net.minecraft.entity.item.EntityItem(world, this.getPos().getX(), ((this.getPos().getY()) + 0.5), this.getPos().getZ(), new net.minecraft.item.ItemStack(net.minecraft.init.Items.ARROW));
    potionEntity.motionY = ((java.util.concurrent.ThreadLocalRandom.current().nextGaussian()) * 0.05000000074505806) + 0.20000000298023224;
    world.spawnEntity(potionEntity);
    return true;
}