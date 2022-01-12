public static java.util.List<net.minecraft.item.ItemStack> getStackWithAllOre(net.minecraft.item.ItemStack stack) {
    java.util.ArrayList<net.minecraft.item.ItemStack> list = new java.util.ArrayList<net.minecraft.item.ItemStack>();
    for (int oreID : net.minecraftforge.oredict.OreDictionary.getOreIDs(stack)) {
        for (net.minecraft.item.ItemStack ore : net.minecraftforge.oredict.OreDictionary.getOres(net.minecraftforge.oredict.OreDictionary.getOreName(oreID))) {
            net.minecraft.item.ItemStack newOre = stack;
            newOre.stackSize = stack.stackSize;
            list.add(newOre);
        }
    }
    if (list.isEmpty()) {
        list.add(stack);
    }
    return list;
}