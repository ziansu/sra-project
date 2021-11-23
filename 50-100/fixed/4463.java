public net.minecraft.item.ItemStack onEaten(net.minecraft.item.ItemStack stack, net.minecraft.world.World world, net.minecraft.entity.player.EntityPlayer player) {
    player.attackEntityFrom(DamageSource.starve, 1.5F);
    if (world.isRemote)
        player.performHurtAnimation();
    
    player.addPotionEffect(new net.minecraft.potion.PotionEffect(Potion.moveSlowdown.id, 600, 0));
    return super.onEaten(stack, world, player);
}