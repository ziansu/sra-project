public static java.util.List<net.minecraft.item.ItemStack> asList(int size) {
    java.util.ArrayList<net.minecraft.item.ItemStack> list = new java.util.ArrayList<>(size);
    for (int i = 0; i < size; i++) {
        list.add(ItemStack.EMPTY);
    }
    return list;
}