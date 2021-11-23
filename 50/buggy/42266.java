@java.lang.Override
public boolean hasCapability(@javax.annotation.Nonnull
net.minecraftforge.common.capabilities.Capability<?> capability, @javax.annotation.Nullable
net.minecraft.util.EnumFacing facing) {
    return (facing == (net.minecraft.util.EnumFacing.NORTH)) && (capability == (com.alesharik.gearsmod.capability.smoke.SmokeCapability.DEFAULT_CAPABILITY));
}