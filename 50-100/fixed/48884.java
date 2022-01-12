private net.minecraft.client.entity.EntityOtherPlayerMP getClosestPlayer(net.minecraft.client.Minecraft mc) {
    for (net.minecraft.entity.Entity o : mc.theWorld.getLoadedEntityList()) {
        if (o instanceof net.minecraft.client.entity.EntityOtherPlayerMP) {
            net.minecraft.client.entity.EntityOtherPlayerMP p = ((net.minecraft.client.entity.EntityOtherPlayerMP) (o));
            if ((p.getGameProfile()) != (mc.thePlayer.getGameProfile())) {
                if (((p.getDistanceToEntity(mc.thePlayer)) <= (threshold)) || ((threshold) < 0)) {
                    return p;
                }
            }
        }
    }
    return null;
}