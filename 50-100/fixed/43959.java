@java.lang.Override
@Optional.Method(modid = "MineFactoryReloaded")
public java.util.List<net.minecraft.item.ItemStack> getDrops(net.minecraft.world.World world, java.util.Random rand, java.util.Map<java.lang.String, java.lang.Boolean> harvesterSettings, int x, int y, int z) {
    return java.util.Arrays.asList(new net.minecraft.item.ItemStack[]{ new net.minecraft.item.ItemStack(com.greyfall.necromantia.common.items.ModItems.rice, net.minecraft.util.MathHelper.getRandomIntegerInRange(rand, 2, 5)) });
}