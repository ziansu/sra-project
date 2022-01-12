@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void PlayerDeath(net.minecraftforge.event.entity.living.LivingDeathEvent event) {
    if (runEvent(com.cloudcom.itsnotamod.notaaction.craftingCraft.PlayerDeathEventHandler.Name, event)) {
        event.getEntityLiving().setHealth(20);
        event.getEntityLiving().addPotionEffect(new net.minecraft.potion.PotionEffect(net.minecraft.potion.Potion.getPotionById(11), 10, 10000));
    }
}