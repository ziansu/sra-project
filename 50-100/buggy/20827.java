public final void updateEndurance(net.minecraft.entity.player.EntityPlayer player) {
    if (crowsofwar.gorecore.util.GoreCoreIsPlayerWalking.isWalkingStatic(player)) {
        gainEndurance(PhysicalTraits.configuration.setting_enduranceWalking());
    }else
        if (player.isSprinting()) {
            gainEndurance(PhysicalTraits.configuration.setting_enduranceSprinting());
        }else {
            loseEndurance(PhysicalTraits.configuration.setting_enduranceLoss($missing$()));
        }
    
}