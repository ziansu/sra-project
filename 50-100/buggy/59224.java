@java.lang.Override
public void onWorldChange(net.minecraftforge.event.entity.EntityJoinWorldEvent event) {
    net.minecraft.entity.player.EntityPlayerMP player = ((net.minecraft.entity.player.EntityPlayerMP) (event.entity));
    if ((event.world.provider.dimensionId) == (this.worldObj.provider.dimensionId)) {
        if (withinRange(player)) {
            if (!(player.isDead)) {
                flyPlayer(player);
            }
        }
    }else {
        if (this.tickets.containsKey(player)) {
            dropPlayer(player);
        }
    }
}