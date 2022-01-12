@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
public static void SyncZombieMessage(int entityID) {
    net.minecraft.client.multiplayer.WorldClient world = net.minecraft.client.Minecraft.getMinecraft().theWorld;
    net.minecraft.entity.Entity entity = world.getEntityByID(entityID);
    if (entity instanceof net.minecraft.entity.monster.EntityZombie) {
        sidben.villagertweaks.tracker.ClientInfoTracker.SyncZombieMessage(((net.minecraft.entity.monster.EntityZombie) (entity)));
    }
}