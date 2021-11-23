public int getCapacity(org.bukkit.block.Block b) {
    if ((me.mrCookieSlime.Slimefun.api.BlockStorage.getBlockInfo(b, "capacity")) == null) {
        me.mrCookieSlime.Slimefun.api.BlockStorage.addBlockInfo(b, "capacity", java.lang.String.valueOf(this.capacity));
    }
    return java.lang.Integer.valueOf(me.mrCookieSlime.Slimefun.api.BlockStorage.getBlockInfo(b, "capacity")).intValue();
}