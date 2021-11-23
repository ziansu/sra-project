protected org.winterblade.minecraft.harmony.api.drops.BaseDropMatchResult matches(net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos) {
    net.minecraft.util.math.AxisAlignedBB bb = new net.minecraft.util.math.AxisAlignedBB(pos).expandXyz(dist);
    int returnOn = ((max) != (java.lang.Integer.MAX_VALUE)) ? java.lang.Integer.MAX_VALUE : min;
    int foundCount = world.getEntitiesWithinAABB(net.minecraft.entity.EntityLiving.class, bb, this::matchesEntity).size();
    return ((min) <= foundCount) && (foundCount <= (max)) ? org.winterblade.minecraft.harmony.api.drops.BaseDropMatchResult.True : org.winterblade.minecraft.harmony.api.drops.BaseDropMatchResult.False;
}