@java.lang.Override
public java.util.ArrayList<net.minecraft.item.ItemStack> getDrops(net.minecraft.world.World world, int x, int y, int z, int meta, int fortune) {
    java.util.ArrayList a = new java.util.ArrayList<net.minecraft.item.ItemStack>();
    a.add(new net.minecraft.item.ItemStack(net.minecraft.item.Item.getItemFromBlock(Blocks.obsidian), 1));
    a.add(new net.minecraft.item.ItemStack(net.minecraft.init.Items.dye, (2 * (fortune + 1)), 4));
    return a;
}