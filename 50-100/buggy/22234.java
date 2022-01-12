public void generate(java.util.Random random, int x, int z, net.minecraft.world.World world, net.minecraft.world.chunk.IChunkProvider ichunkprovider1, net.minecraft.world.chunk.IChunkProvider ichunkprovider2) {
    if ((!((world.provider.dimensionId) == (-1))) || (!((world.provider.dimensionId) == 0))) {
        com.lukeplechaty.ores.control.GenOre.generateSurface(world, random, (x * 16), (z * 16));
    }
}