@java.lang.Override
public void onUpdate(net.minecraft.item.ItemStack stack, net.minecraft.world.World world, net.minecraft.entity.Entity entity, int par4, boolean par5) {
    super.onUpdate(stack, world, entity, par4, par5);
    {
        net.minecraft.entity.player.EntityPlayer player = ((net.minecraft.entity.player.EntityPlayer) (entity));
        net.minecraft.item.ItemStack equipped = player.getCurrentEquippedItem();
        if (equipped == stack) {
            player.addPotionEffect(new net.minecraft.potion.PotionEffect(Potion.damageBoost.getId(), 20, 1));
        }
    }
}