@java.lang.Override
public void updatePlayerMoveState() {
    net.minecraft.client.entity.EntityPlayerSP player = net.minecraft.client.Minecraft.getMinecraft().thePlayer;
    if ((ClientHookHandler.hook) == null) {
        original.updatePlayerMoveState();
        player.movementInput = original;
    }else
        if (player.onGround) {
            super.updatePlayerMoveState();
        }else {
            this.jump = net.minecraft.client.Minecraft.getMinecraft().gameSettings.keyBindJump.getIsKeyPressed();
            this.sneak = net.minecraft.client.Minecraft.getMinecraft().gameSettings.keyBindSneak.getIsKeyPressed();
        }
    
}