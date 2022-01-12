@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void sheepAreResilient(net.minecraftforge.event.entity.living.LivingDeathEvent event) {
    net.minecraft.entity.Entity entity = event.entity;
    if (!(entity instanceof net.minecraft.entity.passive.EntitySheep)) {
        return ;
    }
    for (int i = 0; i < 5; i++) {
        net.minecraft.entity.passive.EntitySheep sheep = new net.minecraft.entity.passive.EntitySheep(event.entity.worldObj);
        spawnEntity(event, sheep);
    }
}