public void handleFireyUpgrade(net.minecraftforge.event.entity.living.LivingAttackEvent event) {
    net.minecraft.entity.player.EntityPlayer player = ((net.minecraft.entity.player.EntityPlayer) (event.source.getSourceOfDamage()));
    if (player != null) {
        at.korti.endermystic.api.tools.ItemStack stack = player.inventory.getCurrentItem();
        if (hasUpgrade(stack, ToolUpgrade.firey)) {
            event.entityLiving.setFire((5 * (getLevelOfUpgrade(stack, ToolUpgrade.firey))));
        }
    }
}