@java.lang.Override
public boolean execute(net.minecraft.world.World world, int x, int y, int z) {
    if ((targets[0].getEntity()) instanceof net.minecraft.entity.passive.EntityAnimal) {
        if (!(((net.minecraft.entity.passive.EntityAnimal) (targets[0].getEntity())).isChild())) {
            ((net.minecraft.entity.passive.EntityAnimal) (targets[0].getEntity())).onKillCommand();
            return true;
        }
    }
    return false;
}