@javax.annotation.Nonnull
@java.lang.Override
public java.util.Set<net.minecraft.util.math.BlockPos> generateTrunk(net.minecraft.world.World world, java.util.Random rand, forestry.arboriculture.worldgen.TreeBlockTypeLog wood, net.minecraft.util.math.BlockPos startPos) {
    forestry.core.worldgen.WorldGenHelper.generateTreeTrunk(world, rand, wood, startPos, height, girth, 0, 0, null, 0);
    return forestry.core.worldgen.WorldGenHelper.generateBranches(world, rand, wood, startPos.add(0, height, 0), girth, 0.15F, 0.25F, ((height) / 4), 1, 0.25F);
}