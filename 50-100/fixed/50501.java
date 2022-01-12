@java.lang.Override
public void trigger(net.minecraft.world.World world, net.minecraft.util.math.BlockPos position, talecraft.invoke.EnumTriggerState triggerState) {
    if (world.isRemote)
        return ;
    
    net.minecraft.tileentity.TileEntity tileentity = world.getTileEntity(position);
    if (tileentity instanceof talecraft.tileentity.RedstoneTriggerBlockTileEntity) {
        ((talecraft.tileentity.RedstoneTriggerBlockTileEntity) (tileentity)).invokeFromUpdateTick(triggerState, true);
        ((talecraft.tileentity.RedstoneTriggerBlockTileEntity) (tileentity)).invokeFromUpdateTick(triggerState, false);
    }
}