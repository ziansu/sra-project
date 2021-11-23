public net.minecraft.item.ItemStack[] getValidItems() {
    java.util.List<net.minecraft.item.ItemStack> buf = new java.util.ArrayList<net.minecraft.item.ItemStack>();
    if ((stack) != null) {
        buf.add(stack);
    }
    if (!(oreDictionaryEntry.equals(""))) {
        buf.addAll(net.minecraftforge.oredict.OreDictionary.getOres(oreDictionaryEntry));
    }
    return buf.toArray(EMPTY_ISTACK_ARRAY);
}