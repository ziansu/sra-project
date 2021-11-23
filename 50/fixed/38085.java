@java.lang.Override
public void init(net.minecraft.entity.Entity entity, net.minecraft.world.World world) {
    if (world != null)
        milkLevel = 3000 + (world.rand.nextInt(12000));
    
}