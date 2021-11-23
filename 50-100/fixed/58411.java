@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
public static void onClientPreInit() {
    com.mrtrollnugnug.ropebridge.lib.ModUtils.registerItemInvModel(com.mrtrollnugnug.ropebridge.handler.ContentHandler.itemBridgeHook, 0, ((com.mrtrollnugnug.ropebridge.lib.Constants.MOD_ID) + ":bridge_builder_hook"));
    com.mrtrollnugnug.ropebridge.lib.ModUtils.registerItemInvModel(com.mrtrollnugnug.ropebridge.handler.ContentHandler.itemBarrel, 0, ((com.mrtrollnugnug.ropebridge.lib.Constants.MOD_ID) + ":bridge_builder_barrel"));
    com.mrtrollnugnug.ropebridge.lib.ModUtils.registerItemInvModel(com.mrtrollnugnug.ropebridge.handler.ContentHandler.itemHandle, 0, ((com.mrtrollnugnug.ropebridge.lib.Constants.MOD_ID) + ":bridge_builder_handle"));
    com.mrtrollnugnug.ropebridge.lib.ModUtils.registerItemInvModel(com.mrtrollnugnug.ropebridge.handler.ContentHandler.itemBridgeBuilder);
    com.mrtrollnugnug.ropebridge.lib.ModUtils.registerItemInvModel(com.mrtrollnugnug.ropebridge.handler.ContentHandler.itemLadderBuilder);
    com.mrtrollnugnug.ropebridge.lib.ModUtils.registerItemInvModel(com.mrtrollnugnug.ropebridge.handler.ContentHandler.itemLadderHook);
    com.mrtrollnugnug.ropebridge.lib.ModUtils.registerItemInvModel(com.mrtrollnugnug.ropebridge.handler.ContentHandler.itemRope);
}