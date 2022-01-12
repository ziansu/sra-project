private void hurtCassock(net.minecraftforge.event.entity.living.LivingHurtEvent event, net.minecraft.entity.player.EntityPlayer entityPlayer) {
    if (((entityPlayer.getHealth()) - (event.ammount)) <= 0) {
        entityPlayer.setHealth(((entityPlayer.getMaxHealth()) / 2));
        unstudio.chinacraft.entity.fx.FxHelper.spawnEffects(("blockcrack_" + (unstudio.chinacraft.item.combat.ModelArmorCassock.getItemId())), entityPlayer.worldObj, ((entityPlayer.posX) - 0.5), entityPlayer.posY, ((entityPlayer.posZ) - 0.5));
        entityPlayer.inventory.armorInventory[2] = null;
    }
}