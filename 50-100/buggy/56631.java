private void fixPositions(net.minecraft.entity.player.EntityPlayer thePlayer, boolean localPlayer) {
    this.lastTickPosX = prevPosX = player.prevPosX;
    this.lastTickPosY = prevPosY = player.prevPosY;
    this.lastTickPosZ = prevPosZ = player.prevPosZ;
    this.posX = player.posX;
    this.posY = player.posY;
    this.posZ = player.posZ;
    setPosition(posX, posY, posZ);
    this.prevRotationYaw = player.prevRenderYawOffset;
    this.rotationYaw = player.renderYawOffset;
    this.prevRotationPitch = player.prevRotationPitch;
    this.rotationPitch = player.rotationPitch;
}