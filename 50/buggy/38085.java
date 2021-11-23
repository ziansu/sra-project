@java.lang.Override
public void init(net.minecraft.entity.Entity entity, net.minecraft.world.World world) {
    milkLevel = 3000 + (world.rand.nextInt(12000));
}