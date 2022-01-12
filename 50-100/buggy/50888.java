private void setToReachPosition() {
    net.minecraft.util.MovingObjectPosition trace = mc.objectMouseOver;
    if ((trace.typeOfHit) == (MovingObjectPosition.MovingObjectType.BLOCK)) {
        mc.thePlayer.sendQueue.addToSendQueue(new net.minecraft.network.play.client.C03PacketPlayer.C04PacketPlayerPosition(((java.lang.Math.floor(trace.hitVec.xCoord)) - 0.5), trace.hitVec.yCoord, ((java.lang.Math.floor(trace.hitVec.zCoord)) - 0.5), mc.thePlayer.onGround));
    }
}