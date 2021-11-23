void stripSCSData(final org.bukkit.inventory.ItemStack nms, final boolean lastlore) {
    if ((nms.getTag()) == null) {
        return ;
    }
    nms.getTag().remove("scs_price");
    if (lastlore) {
        removeLastLore(nms);
    }
    if ((nms.getTag().c().size()) == 0) {
        nms.setTag(null);
    }
}