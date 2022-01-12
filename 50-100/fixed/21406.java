@org.spongepowered.asm.mixin.injection.Inject(method = "sendPacket", at = @org.spongepowered.asm.mixin.injection.At(value = "HEAD"))
public void onResourcePackSend(net.minecraft.network.Packet packet, org.spongepowered.asm.mixin.injection.callback.CallbackInfo ci) {
    if (packet instanceof org.spongepowered.common.interfaces.IMixinPacketResourcePackSend) {
        org.spongepowered.common.interfaces.IMixinPacketResourcePackSend p = ((org.spongepowered.common.interfaces.IMixinPacketResourcePackSend) (packet));
        this.sentResourcePacks.put(p.setFakeHash(), p.getResourcePack());
    }
}