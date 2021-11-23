@cpw.mods.fml.relauncher.SideOnly(value = cpw.mods.fml.relauncher.Side.CLIENT)
@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void preRenderPlayer(net.minecraftforge.client.event.RenderPlayerEvent.Pre event) {
    if (event.entityPlayer.isSneaking()) {
        if (((event.entityPlayer.worldObj.getWorldTime()) < 13500) && ((event.entityPlayer.worldObj.getWorldTime()) > 22300))
            return ;
        
        if (!(unstudio.chinacraft.api.ChinaCraftApi.isWearingWholeNightClothes(event.entityPlayer)))
            return ;
        
        event.setCanceled(true);
    }
}