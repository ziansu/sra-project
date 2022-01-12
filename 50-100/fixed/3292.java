@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
public static void SyncGolemMessage(int entityID) {
    net.minecraft.client.multiplayer.WorldClient world = net.minecraft.client.Minecraft.getMinecraft().theWorld;
    if (world == null)
        return ;
    
    net.minecraft.entity.Entity entity = world.getEntityByID(entityID);
    if (entity instanceof net.minecraft.entity.monster.EntityIronGolem) {
        sidben.villagertweaks.tracker.ClientInfoTracker.SyncGolemMessage(((net.minecraft.entity.monster.EntityIronGolem) (entity)));
    }else
        if (entity instanceof net.minecraft.entity.monster.EntitySnowman) {
            sidben.villagertweaks.tracker.ClientInfoTracker.SyncGolemMessage(((net.minecraft.entity.monster.EntitySnowman) (entity)));
        }
    
}