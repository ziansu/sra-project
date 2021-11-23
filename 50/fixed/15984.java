@java.lang.Override
public li.cil.oc.api.prefab.ManagedEnvironment createEnvironment(net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos, net.minecraft.util.EnumFacing side) {
    return new com.brandon3055.draconicevolution.integration.computers.oc.DEManagedPeripheral(((com.brandon3055.draconicevolution.integration.computers.IDEPeripheral) (world.getTileEntity(pos))));
}