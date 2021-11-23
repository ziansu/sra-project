@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void PlayerDeath(net.minecraftforge.event.entity.living.LivingDeathEvent event) {
    com.cloudcom.itsnotamod.notaaction.NotAStructure str = runEvent(com.cloudcom.itsnotamod.notaaction.craftingCraft.PlayerDeathEventHandler.Name, event);
    if ((str != null) && (str.setCancel(com.cloudcom.itsnotamod.notaaction.craftingCraft.PlayerDeathEventHandler.Name))) {
        event.getEntityLiving().setHealth(20);
        event.getEntityLiving().addPotionEffect(new net.minecraft.potion.PotionEffect(net.minecraft.potion.Potion.getPotionById(11), 10, 10000));
    }
}