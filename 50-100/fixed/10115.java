@java.lang.Override
public boolean canDrain(net.minecraft.util.EnumFacing from, net.minecraftforge.fluids.Fluid fluid) {
    if ((hasFrequency()) && ((configComponent.getOutput(TransmissionType.FLUID, from, facing).ioState) == (mekanism.common.SideData.IOState.OUTPUT))) {
        return (fluid == null) || (fluid == (frequency.storedFluid.getFluid().getFluid()));
    }
    return false;
}