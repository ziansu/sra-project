@java.lang.Override
public net.codepixl.GLCraft.util.AABB getAABB(int x, int y, int z, byte meta, net.codepixl.GLCraft.world.WorldManager w) {
    if (meta < 2)
        return new net.codepixl.GLCraft.util.AABB(0.0625F, 1, 1).update(new org.lwjgl.util.vector.Vector3f(x, y, (z + 0.5F)));
    else
        return new net.codepixl.GLCraft.util.AABB(1, 1, 0.0625F).update(new org.lwjgl.util.vector.Vector3f((x + 0.5F), y, z));
    
}