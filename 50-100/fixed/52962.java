private java.util.List<net.minecraft.item.ItemStack> toItemStackList(java.util.Collection<net.minecraft.item.ItemStack> inputs) {
    java.util.List<net.minecraft.item.ItemStack> ret = new java.util.LinkedList<>();
    for (net.minecraft.item.ItemStack o : inputs) {
        if (o != null) {
            ret.add(o.copy());
        }
    }
    return ret;
}