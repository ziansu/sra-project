private org.bukkit.inventory.Inventory choosePriceAndAmount(int amount, double price) {
    org.bukkit.inventory.Inventory gui = org.bukkit.Bukkit.createInventory(null, 18, TRADE_OFFER_CHOOSE_PRICE_AND_AMOUNT.replace("&v1", java.lang.String.valueOf(amount)).replace("&v2", java.lang.String.valueOf(price)));
    gui.setContents(choosePriceAndAmount);
    return gui;
}