public void handleSharpnessUpgrade(net.minecraftforge.event.entity.living.LivingAttackEvent event) {
    net.minecraft.entity.player.EntityPlayer player = ((net.minecraft.entity.player.EntityPlayer) (event.source.getSourceOfDamage()));
    if (player != null) {
        at.korti.endermystic.api.tools.ItemStack stack = player.inventory.getCurrentItem();
        if (hasUpgrade(stack, ToolUpgrade.sharpness)) {
            float amount = calcAttackDamage(stack);
            event.entityLiving.attackEntityFrom(DamageSource.generic, amount);
        }
    }
}