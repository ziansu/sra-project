public boolean onInserted(net.minecraft.item.ItemStack item) {
    for (int i = 0; i < (pattern.getOutputs().length); ++i) {
        if ((!(satisfied[i])) && (refinedstorage.RefinedStorageUtils.compareStackNoQuantity(item, pattern.getOutputs()[i]))) {
            satisfied[i] = true;
            return true;
        }
    }
    return false;
}