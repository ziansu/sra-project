public static net.minecraft.util.math.BlockPos transformedBlockPos(net.minecraft.world.gen.structure.template.PlacementSettings placement, net.minecraft.util.math.BlockPos pos) {
    return fi.dy.masa.enderutilities.util.PositionUtils.getTransformedBlockPos(pos, placement.getMirror(), placement.getRotation());
}