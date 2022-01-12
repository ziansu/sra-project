@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onPlayerLogin(@org.jetbrains.annotations.NotNull
final net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent event) {
    if ((event.player) instanceof net.minecraft.entity.player.EntityPlayerMP) {
        com.minecolonies.coremod.MineColonies.getNetwork().sendTo(new com.minecolonies.coremod.network.messages.ServerUUIDMessage(), ((net.minecraft.entity.player.EntityPlayerMP) (event.player)));
        com.minecolonies.coremod.MineColonies.getNetwork().sendTo(new com.minecolonies.coremod.network.messages.ColonyStylesMessage(), ((net.minecraft.entity.player.EntityPlayerMP) (event.player)));
    }
}