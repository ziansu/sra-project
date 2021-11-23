@java.lang.Override
public void onArmorTick(net.minecraft.world.World world, net.minecraft.entity.player.EntityPlayer player, net.minecraft.item.ItemStack itemStack) {
    if ((player.fallDistance) > 1) {
        player.fallDistance = 0;
        world.playSound(null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_CHICKEN_HURT, SoundCategory.PLAYERS, 2.5F, 1.0F);
    }
}