@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void onRenderPlanetPre(micdoodle8.mods.galacticraft.api.event.client.CelestialBodyRenderEvent.Pre event) {
    if ((event.celestialBody) == (micdoodle8.mods.galacticraft.core.GalacticraftCore.planetOverworld)) {
        if (!(micdoodle8.mods.galacticraft.core.proxy.ClientProxyCore.overworldTextureRequestSent)) {
            GalacticraftCore.packetPipeline.sendToServer(new micdoodle8.mods.galacticraft.core.network.PacketSimple(PacketSimple.EnumSimplePacket.S_REQUEST_OVERWORLD_IMAGE, new java.lang.Object[]{  }));
            micdoodle8.mods.galacticraft.core.proxy.ClientProxyCore.overworldTextureRequestSent = true;
        }
        if (micdoodle8.mods.galacticraft.core.proxy.ClientProxyCore.overworldTexturesValid) {
            event.celestialBodyTexture = null;
            org.lwjgl.opengl.GL11.glBindTexture(GL11.GL_TEXTURE_2D, micdoodle8.mods.galacticraft.core.proxy.ClientProxyCore.overworldTextureClient.getGlTextureId());
        }
    }
}