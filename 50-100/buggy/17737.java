public void onInserted(net.minecraft.item.ItemStack inserted) {
    for (int i = 0; i < (pattern.getOutputs().length); ++i) {
        if ((!(satisfied[i])) && (refinedstorage.RefinedStorageUtils.compareStackNoQuantity(inserted, pattern.getOutputs()[i]))) {
            satisfied[i] = true;
            return ;
        }
    }
}