@java.lang.Override
public boolean isPositionAllowed(net.minecraft.world.World world, zmaster587.libVulpes.util.HashedBlockPosition pos, java.util.List<zmaster587.advancedRocketry.api.AreaBlob> otherBlobs) {
    for (zmaster587.advancedRocketry.api.AreaBlob blob : otherBlobs) {
        if (blob.contains(pos))
            return false;
        
    }
    return !(SealableBlockHandler.INSTANCE.isBlockSealed(world, pos.getBlockPos()));
}