@org.spongepowered.asm.mixin.injection.Inject(method = "sendPacket", at = @org.spongepowered.asm.mixin.injection.At(value = "HEAD"))
public void onResourcePackSend(net.minecraft.network.Packet packet, org.spongepowered.asm.mixin.injection.callback.CallbackInfo ci) {
    if (packet instanceof net.minecraft.network.play.server.S48PacketResourcePackSend) {
        net.minecraft.network.play.server.S48PacketResourcePackSend p = ((net.minecraft.network.play.server.S48PacketResourcePackSend) (packet));
        ((org.spongepowered.common.interfaces.IMixinPacketResourcePackSend) (p)).setFakeHash();
        this.sentResourcePacks.put(p.getHash().trim(), ((org.spongepowered.common.interfaces.IMixinPacketResourcePackSend) (p)).getResourcePack());
    }
}