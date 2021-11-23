@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
public static void textureStitchPre(net.minecraftforge.client.event.TextureStitchEvent.Pre event) {
    mods.railcraft.common.plugins.buildcraft.actions.Actions.textureStitchPre(event.map);
    mods.railcraft.common.plugins.buildcraft.triggers.Triggers.textureStitchPre(event.map);
}