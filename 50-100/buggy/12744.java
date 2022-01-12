public static void onEntityUpdate(com.mumfrey.liteloader.transformers.event.EventInfo<net.minecraft.entity.player.EntityPlayer> e) {
    net.minecraft.entity.player.EntityPlayer ep = e.getSource();
    if ((((ep instanceof net.minecraft.entity.player.EntityPlayerMP) && (ep.capabilities.isCreativeMode)) && (me.dags.daflight.DaFlight.get().DFController.noClipOn)) && (me.dags.daflight.DaFlight.get().DFController.flyModOn)) {
        ep.noClip = true;
    }
}