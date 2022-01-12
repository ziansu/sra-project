public void destroy() {
    org.bukkit.event.HandlerList.unregisterAll(this);
    this.plugin = null;
    this.optionNames = null;
    this.optionIcons = null;
    this.inventory = null;
    this.inventory_view = null;
    this.shop_trans = null;
    this.inventory_name = null;
    this.shopstock = null;
}