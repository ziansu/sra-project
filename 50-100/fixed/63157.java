@java.lang.Override
public tbsc.techy.api.wrench.Result dismantle(net.minecraft.item.ItemStack wrench, net.minecraft.entity.EntityLivingBase entity, net.minecraft.util.math.BlockPos target) {
    net.minecraft.world.World world = entity.worldObj;
    tbsc.techy.api.capability.dismantle.ITechyDismantleable dismantle = ((tbsc.techy.api.capability.dismantle.ITechyDismantleable) (world.getBlockState(target).getBlock()));
    return dismantle.dismantle(entity, world, target);
}