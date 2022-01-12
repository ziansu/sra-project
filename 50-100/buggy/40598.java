@javax.annotation.Nullable
public static net.minecraft.item.ItemStack pushItemStack(net.minecraft.item.ItemStack itemToLay, net.minecraft.world.World worldObj, net.minecraft.util.math.Vec3d pos) {
    java.util.List<com.setycz.chickens.block.TileEntityHenhouse> henhouses = com.setycz.chickens.block.TileEntityHenhouse.findHenhouses(worldObj, pos, ((4 + (com.setycz.chickens.block.TileEntityHenhouse.HENHOUSE_RADIUS)) + (com.setycz.chickens.block.TileEntityHenhouse.FENCE_THRESHOLD)));
    for (com.setycz.chickens.block.TileEntityHenhouse henhouse : henhouses) {
        itemToLay = henhouse.pushItemStack(itemToLay);
        if (itemToLay == null) {
            break;
        }
    }
    return itemToLay;
}