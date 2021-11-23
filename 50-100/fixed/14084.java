@java.lang.Override
public boolean allowConnection(net.minecraft.world.World world, net.minecraft.util.EnumFacing flow, buildcraft.api.mj.IMjExternalStorage from, buildcraft.api.mj.IMjExternalStorage to, boolean flowingIn) {
    net.minecraft.util.EnumFacing side = (flowingIn) ? flow : flow == null ? null : flow.getOpposite();
    buildcraft.api.mj.EnumMjDevice fromDevice = from.getDeviceType((side == null ? null : side.getOpposite()));
    buildcraft.api.mj.EnumMjDevice toDevice = to.getDeviceType(side);
    return toDevice.acceptsPowerFrom(fromDevice);
}