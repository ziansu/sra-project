@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void interceptPvP(net.minecraftforge.event.entity.living.LivingAttackEvent event) {
    net.minecraft.entity.Entity attacker = event.source.getEntity();
    net.minecraft.entity.Entity victim = event.entity;
    if (isEntityDirectlyProhibited(attacker))
        if (isEntityEligiblyProhibited(victim))
            event.setCanceled(true);
        
    
    if (isEntityDirectlyProhibited(victim))
        if (isEntityEligiblyProhibited(attacker))
            event.setCanceled(true);
        
    
}