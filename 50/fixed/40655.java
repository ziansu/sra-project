@java.lang.Override
public void onFall(net.minecraftforge.event.entity.living.LivingFallEvent event) {
    if ((event.entity) instanceof net.minecraft.entity.player.EntityPlayerMP) {
        net.minecraft.entity.player.EntityPlayerMP player = ((net.minecraft.entity.player.EntityPlayerMP) (event.entity));
        synchronized(this.tickets) {
            this.tickets.remove(player);
        }
    }
}