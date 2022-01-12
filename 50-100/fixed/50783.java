public static boolean hasCapability(mcmultipart.multipart.IMultipartContainer container, net.minecraftforge.common.capabilities.Capability<?> capability, net.minecraft.util.EnumFacing side) {
    for (net.minecraft.util.EnumFacing face : net.minecraft.util.EnumFacing.VALUES)
        if (((face != side) && ((face.getOpposite()) != side)) && (mcmultipart.capabilities.MultipartCapabilityHelper.hasCapability(container, capability, side, face)))
            return true;
        
    
    return false;
}