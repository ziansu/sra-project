@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onTick(net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent event) {
    if (event.phase.equals(TickEvent.Phase.START)) {
        if ((org.lwjgl.input.Keyboard.getEventKey()) == (ascendKey)) {
            net.minecraft.entity.player.EntityPlayer player = event.player;
            if (player != null) {
                boolean keyPressed = org.lwjgl.input.Keyboard.isKeyDown(ascendKey);
                PacketHandler.network.sendToServer(new com.parachute.common.KeyPressMessage(ascendKey, keyPressed));
            }
        }
    }
}